package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    /**
     * Должен взять из очереди evenElements только четные символы и все их соберет в результирующую строку.
     */
    private String getEvenElements() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; !evenElements.isEmpty(); i++) {
            if (i % 2 == 0) {
                string.append(evenElements.pop());
            } else {
                evenElements.pop();
            }
        }
        return string.toString();
    }

    /**
     * Должен брать символы начиная с последнего символа и так пока не заберет их все.
     */
    private String getDescendingElements() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; !descendingElements.isEmpty(); i++) {
            string.append(descendingElements.pollLast());
        }
        return string.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}