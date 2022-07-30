package com.example.demo.pojo;

public class Account {
    private int id;
    private double addMoney;
    private double reduceMoney;

    public double getAddMoney() {
        return addMoney;
    }

    public void setAddMoney(double addMoney) {
        this.addMoney = addMoney;
    }

    public double getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(double reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "addMoney=" + addMoney +
                ", reduceMoney=" + reduceMoney +
                '}';
    }
}
