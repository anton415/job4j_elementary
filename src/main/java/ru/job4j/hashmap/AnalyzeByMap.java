package ru.job4j.hashmap;

import java.util.*;

/**
 * Класс AnalyzeByMap получает статистику по аттестатам.
 * @author Anton Serdyuchenko
 * @version 1.0
 * @since 03.10.2025 08:38
 */
public class AnalyzeByMap {
    /**
     * Вычисляет общий средний балл.
     */
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0;
        int numberOfElements = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                numberOfElements++;
                totalScore += subject.score();
            }
        }
        return totalScore / numberOfElements;
    }

    /**
     * Вычисляет средний балл по каждому ученику.
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> listWithAverageScoreByPupil = new LinkedList<>();
        double averageScoreByPupil;
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            int numberOfSubjects = pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            averageScoreByPupil = totalScore / numberOfSubjects;
            Label label = new Label(pupil.name(), averageScoreByPupil);
            listWithAverageScoreByPupil.add(label);
        }
        return listWithAverageScoreByPupil;
    }

    /**
     * Вычисляет средний балл по каждому предмету.
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> listWithAverageScoreBySubject = new LinkedList<>();
        Map<String, Integer> totalScoreBySubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                if (totalScoreBySubject.containsKey(subject.name())) {
                    int score = totalScoreBySubject.get(subject.name());
                    score += subject.score();
                    totalScoreBySubject.replace(subject.name(), score);
                } else {
                    totalScoreBySubject.put(subject.name(), subject.score());
                }
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : totalScoreBySubject.entrySet()) {
            Label label = new Label(stringIntegerEntry.getKey(), (double) stringIntegerEntry.getValue() / pupils.size());
            listWithAverageScoreBySubject.add(label);
        }
        return listWithAverageScoreBySubject;
    }

    /**
     * Возвращает лучшего ученика.
     * Лучшим считается ученик с наибольшим суммарным баллом по всем предметам.
     * @return  Возвращает объект Label (имя ученика и суммарный балл).
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> listWithAverageScoreByPupil = new LinkedList<>();
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            Label label = new Label(pupil.name(), totalScore);
            listWithAverageScoreByPupil.add(label);
        }
        listWithAverageScoreByPupil.sort(Comparator.naturalOrder());
        return listWithAverageScoreByPupil.get(listWithAverageScoreByPupil.size() - 1);
    }

    /**
     * Возвращает предмет с наибольшим баллом для всех студентов.
     * @return  Возвращает объект Label (имя предмета, сумма баллов каждого ученика по этому предмету).
     */
    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> listWithTotalScoreBySubject = new LinkedList<>();
        Map<String, Integer> totalScoreBySubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                if (totalScoreBySubject.containsKey(subject.name())) {
                    int score = totalScoreBySubject.get(subject.name());
                    score += subject.score();
                    totalScoreBySubject.replace(subject.name(), score);
                } else {
                    totalScoreBySubject.put(subject.name(), subject.score());
                }
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : totalScoreBySubject.entrySet()) {
            Label label = new Label(stringIntegerEntry.getKey(), (double) stringIntegerEntry.getValue());
            listWithTotalScoreBySubject.add(label);
        }
        listWithTotalScoreBySubject.sort(Comparator.naturalOrder());
        return listWithTotalScoreBySubject.get(listWithTotalScoreBySubject.size() - 1);
    }
}
