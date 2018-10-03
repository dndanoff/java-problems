/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danoff.problems;

import java.time.LocalDate;

/**
 *
 * @author Denis
 */
public class DayOfWeekSolver {

    public static String getDay(String day, String month, String year) {
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println(getDay("05", "08", "2015"));
    }
}
