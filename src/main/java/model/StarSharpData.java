package model;

import java.util.Map;

public class StarSharpData {
    private static Map<String, String> tableStar;
    private static String username;
    private static String password;
    private static String name;
    private static String parentUnit;
    private static String nameReu;
    private static String type;
    private static String number;
    private static String starDate;
    private static String starHour;
    private static String endDate;
    private static String endHour;
    private static String location;
    private static String unit;
    private static String organized;
    private static String reporter;
    private static String contact;

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getName() {
        return name;
    }

    public static String getParentUnit() {
        return parentUnit;
    }

    public static String getNameReu() {
        return nameReu;
    }

    public static String getType() {
        return type;
    }

    public static String getNumber() {
        return number;
    }

    public static String getStarDate() {
        return starDate;
    }

    public static String getStarHour() {
        return starHour;
    }

    public static String getEndDate() {
        return endDate;
    }

    public static String getEndHour() {
        return endHour;
    }

    public static String getLocation() {
        return location;
    }

    public static String getUnit() {
        return unit;
    }

    public static String getOrganized() {
        return organized;
    }

    public static String getReporter() {
        return reporter;
    }

    public static String getContact() {
        return contact;
    }

    public static void setTableStar(Map<String, String> tableStar) {
        StarSharpData.tableStar = tableStar;
        StarSharpData.username = tableStar.get("username");
        StarSharpData.password = tableStar.get("password");
        StarSharpData.name = tableStar.get("name");
        StarSharpData.parentUnit = tableStar.get("parentUnit");
        StarSharpData.nameReu = tableStar.get("nameReu");
        StarSharpData.type = tableStar.get("type");
        StarSharpData.name = tableStar.get("name");
        StarSharpData.number = tableStar.get("number");
        StarSharpData.starDate = tableStar.get("starDate");
        StarSharpData.endDate = tableStar.get("endDate");
        StarSharpData.starHour = tableStar.get("starHour");
        StarSharpData.endHour = tableStar.get("endHour");
        StarSharpData.location = tableStar.get("location");
        StarSharpData.unit = tableStar.get("unit");
        StarSharpData.organized = tableStar.get("organized");
        StarSharpData.reporter = tableStar.get("reporter");
        StarSharpData.contact = tableStar.get("contact");
    }

}
