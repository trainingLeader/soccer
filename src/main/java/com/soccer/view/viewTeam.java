package com.soccer.view;

import java.util.Optional;
import java.util.Scanner;

public class viewTeam {
 public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Pais");
            System.out.println("2. Actualizar Pais");
            System.out.println("3. Buscar Pais por ID");
            System.out.println("4. Eliminar Pais");
            System.out.println("5. Listar todos Paises");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el nobre del pais: ");
                    String createName = scanner.nextLine();


                    break;

                case 2:
                    System.out.print("Ingrese  ID a actualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nobre: ");
                    String updateName = scanner.nextLine();


                    break;

                case 3:
                    System.out.print("Ingrese el Id del pais a buscar: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();


                    break;

                case 4:
                    System.out.print("Ingrese el Id del pais a borrar: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    break;

                case 5:

                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}
