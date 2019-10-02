package com.ggave.gestorgastos;

import java.util.ArrayList;
import java.util.List;

public class Repositorio{

    private static List<Listado> contacts;

    static {
        contacts = new ArrayList<>();


        contacts.add(new Listado(2000, "ingreso", "ahorro"));
        contacts.add(new Listado(1000, "egreso", "targeta"));
        contacts.add(new Listado(900, "egreso", "targeta"));



    }
}