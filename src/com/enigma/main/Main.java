package com.enigma.main;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//    fungsiLogika();
//    soalIfElse();
//    TernaryOperator();
//        Array();
//        NestedLoop();
//        arrayMultidimensi();
        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        sayHello(name);

//        int result = add(5,5);
//        System.out.println(result);
//
//        String result = biodata("Adam","Jakarta");
//        System.out.println(result);
//
//
//        String text = input.nextLine();
//      int result =  hitungKata(text);
//        System.out.println(result);
    }
//    public static void fungsiLogika(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan username: ");
//        String username = input.nextLine();
//        System.out.print("Masukan Password: ");
//        String password = input.nextLine();
//
//        boolean cekUsername = username.equals("adam");
//        boolean cekPassword = password.equals("password123");
//        if(!cekUsername){
//            System.out.println("username salah");
//        } else if (!cekPassword) {
//            System.out.println("password salah");
//        } else if (cekUsername && cekPassword) {
//            System.out.println("berhasil login");
//        }
//        else {
//            System.out.println("username atau password salah");
//        }
//    }
//    public static void soalIfElse(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan Nama: ");
//        String name = input.nextLine();
//        System.out.print("Masukan Peran: ");
//        String peran = input.nextLine();
//        if(name.isEmpty() && peran.isEmpty()){
//            System.out.println("Nama dan peran harus diisi");
//        } else if (!name.isEmpty() && peran.isEmpty()) {
//            System.out.println("Peran Harus Diisi");
//        } else if (!name.isEmpty() && peran.equals("Superhero")) {
//            System.out.println("Selamat Data Superhero " + name + " Kalahkan Semua Monster");
//        }else if(!name.isEmpty() && peran.equals("Monster")){
//            System.out.println("Selamat Datang Monster " +name+ " ,Hancurkan semua superhero");
//        }
//        else{
//            System.out.println("selamat Datang " +name+ " ,Pilih Peranmu untuk melanjutkan Game Ini");
//        }
//    }
//    public static void ternaryOperator(){
//        // lebih sederhana dari if statement, karena hanya terdiri dari kondisi true or false
//        int grade = 75;
//        String result = grade >= 75 ? "selamat anda lolos":"remidi";
//        System.out.println(result);
//    }
//
//    public static void array(){
//        String[] name;
//        name = new String[]{"adam","fachreza","utama"};
////        System.out.println(name[0]);
//
//        name[0] = "Adam";
////        System.out.println(name[0]);
////        System.out.println(name.length);
//
//        String[] hari = new String[7];
//        hari = new String[]{"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
////        System.out.println(hari[2]);
//
//        for(int i = 0; i < hari.length; i++){
////            if(i % 2 == 1){
////                System.out.println(hari[i]); // ngeprint yang selasa kamis sabtu
////            }
//            if(hari[i] != "selasa"){
//                System.out.println(hari[i]);
//            }
//
//            // contoh make foreach
//            for(String value : hari){
//                if(value != "kamis"){
//                    System.out.println(value);
//                }
//            }
//        }
//
//        Integer[] numbers = {1,2,3,4,5,6};
//        Integer[] number2 ={4,5,6,7,8,9};
//
//        for(int i = 0; i<numbers.length; i++){
//            for(int j = 0; j<number2.length; j++){
//                if(number2[j] == numbers[i]){
//                    System.out.println(number2[j]);
//                }
//            }
//        }
//
//        // pass by value
//        // pass by reference(memory yang sama) jika array salinan di ubah, maka akan merubah array induknya, solusinya menggunakan array copy off
//        Integer[] number3 = number2; // contoh pass by reference
//
//        System.out.println(number2); // memorynya sama
//        System.out.println(number3); // memorynya sama
//
//        // jadi jika w ubah array di indeks 3 akan ngerubah di index 2 jg
//
//        Integer[] number4 = Arrays.copyOf(number2,6);
//        System.out.println(number4);
//        number4[2] = 10;
//        for (int i = 0; i < number4.length; i ++){
//            System.out.print(number4[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < number2.length; i ++){
//            System.out.print(number2[i]);
//        }
//
//    }
//
//    public static void nestedLoop(){
//        int baris = 5;
////        for(int i = 1; i < baris; i++){
////            for (int j = 1; j <= i; j++){
////
////                System.out.print("* ");
////            }
////            System.out.println();
////        }
////        // Pola segitiga terbalik
////        for (int i = baris; i >= 1; i--) {
////            for (int j = 1; j <= i; j++) {
////                System.out.print("* ");
////            }
////            System.out.println();
////        }
//
////        while (i <= baris) {
////            j = 1;
////            while (j <= i) {
////                System.out.print("* ");
////                j++;
////            }
////            i++;
////            System.out.println();
////        }
////
////        i = baris - 1;
////        while (i >= 1) {
////            j = 1;
////            while (j <= i) {
////                System.out.print("* ");
////                j++;
////            }
////            i--;
////            System.out.println();
////        }
//
//
//    }
//
//    public static void arrayMultidimensi(){
//        int[][] numb = {{1,2,3},{4,5,6}};
//        for(int i = 0; i < numb.length; i++){
//            for(int j = 0; j < numb.length; j++){
//                System.out.println(numb[i][j]);
//            }
//        }
//    }
//
//    public static void sayHello(String name){
//        System.out.println("Hello "+name);
//    }
    // method return value
    static int add(int a, int b)
    {
        return a + b;
    }
    static String biodata(String name, String address)
    {

        return "Halo " + name + " di " + address;
    }

    static int hitungKata(String input){
        String[] countString = input.split(" ");
        return countString.length;
    }



}