package com.lionkingbank.demo.model;

import java.util.Random;

public class BankAccount {
    private Long index;
    private String name;
    private Double balance;
    private String animalType;
    private boolean isKing;
    private String currency;
    private static String[] currencyList = {"Aruban Guilder", "Botswanan Pula", "China Yuan Renminbi","Honduran Lempira","Indonesia Rupiah",
            "Kyrgyzstan Som", "Kazakhstan Tenge", "Morocco Dirham", "Mauritania Ouguiya", "Mexico Peso","Norway Krone", "Poland Zloty",
            "Serbia Dinar", "Seychelles Rupee", "El Salvador Colon", "Turkmenistan Manat", "United States Dollar","South Africa Rand",
            "Hungary Forint","United Kingdom Pound","Czech Republic Koruna","Australia Dollar"};
    private static Random random = new Random();
    private static long counter = 1;

    public BankAccount(String name, Double balance, String animalType, boolean isKing) {
        this.index = counter;
        this.name = name;
        this.balance = balance;
        this.isKing = isKing;
        this.animalType = animalType;
        this.currency = currencyList[random.nextInt(currencyList.length)];
        ++counter;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static String[] getCurrencyList() {
        return currencyList;
    }

    public static void setCurrencyList(String[] currencyList) {
        BankAccount.currencyList = currencyList;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        BankAccount.random = random;
    }
}
