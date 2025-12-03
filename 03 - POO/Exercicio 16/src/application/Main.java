
package application;

import entities.Employee;
import entities.OutsourceEmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Quantos funcionarios? ");
        int x = sc.nextInt();

        for (int i = 0; i<x; i++){
            System.out.print("PF ou PJ? ");
            String op = sc.next();

            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor p/hora: ");
            double valorHora = sc.nextDouble();

            if (op.equals("PJ")){
                System.out.print("Valor adicional: ");
                double ad = sc.nextDouble();
                employeeList.add(new OutsourceEmp(nome, horas, valorHora, ad));
            }
            else {
                employeeList.add(new Employee(nome, horas, valorHora));
            }

        }

        for (Employee c : employeeList ){
            System.out.print(c.getNome() + "-" + c.payment() + "\n");
        }
    }
}