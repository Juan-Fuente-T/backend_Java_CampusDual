package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise06 {

    public static void main(String[] args) {
        // Creamos una instancia del calendario
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1;
        int hour = now.get(Calendar.HOUR_OF_DAY);
        checkHour(hour);
        checkSeason(month);
    }

    //TODO ↓
    // Si la hora es desde las 0:00 a las 6:59, imprimir por pantalla → It's night
    // Si la hora es desde las 7:00 a las 13:59, imprimir por pantalla → It's morning
    // Si la hora es desde las 14:00 a las 20:59, imprimir por pantalla → It's afternoon
    // Si la hora es desde las 21:00 a las 23:59, imprimir por pantalla → It's night
    public static void checkHour(int hour) {
        {
            switch (hour) {
                case 21:
                case 22:
                case 23:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: {
                    System.out.println("It's night");
                    break;
                }
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13: {
                    System.out.println("It's morning");
                    break;
                }
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20: {
                    System.out.println("It's afternoon");
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + hour);
            }
        }
    }

    //TODO ↓
    // Si es Enero, Febrero o Marzo, imprimir por pantalla → Winter
    // Si es Abril, Mayo o Junio, imprimir por pantalla → Spring
    // Si es Julio, Agosto o Septiembre, imprimir por pantalla → Summer
    // Si es Octubre, Noviembre o Diciembre, imprimir por pantalla → Autumn
    public static void checkSeason(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3: {
                System.out.println("Winter");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("Spring");
                break;

            }
            case 7:
            case 8:
            case 9: {
                System.out.println("Summer");
                break;

            }
            case 10:
            case 11:
            case 12: {
                System.out.println("Autumn");
                break;

            }
            default:
                throw new IllegalArgumentException("Unexpected value: " + month);
        }
    }

}