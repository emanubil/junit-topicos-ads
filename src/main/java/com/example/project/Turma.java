package com.example.project;

import java.util.LinkedList;
import java.util.ListIterator;

public class Turma {

    LinkedList<Double> lista = new LinkedList<>();

    public void addNota(double nota) {
        lista.add(nota);
        
    }

    public double getQuantidadeNotas() {
        double tst = lista.size();
        return tst;

    }

    public double getMediaDasNotas() {
        Double notas = 0.0;
        ListIterator<Double> listIterator = lista.listIterator();

        while (listIterator.hasNext()) {
            notas += listIterator.next();

        }
        return notas / getQuantidadeNotas();
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        int i = 0;
        ListIterator<Double> listIterator = lista.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() > getMediaDasNotas()) {
                i++;
            }
        }
        return i;
    }
}
