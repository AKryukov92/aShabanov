package com.company.lab2;

import java.util.Scanner;

/**
 * Created by pro-8 on 24.03.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        int x; // ���� � ��������
        double b; //���� � ��������
        double r; // ���������
        Scanner s = new Scanner(System.in);
        System.out.println("������� �:");
        x = s.nextInt();
        b = x*Math.PI/180; //������� �� �������� � �������
        r = Math.sin (b); // ���������� ������ �� ��������
        System.out.println(r);
    }
}
