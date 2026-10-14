import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MidtermAct1 {

    public static void main(String[] args) throws Exception {

        prog1();
        prog2();
        prog3();
        prog4();
        prog5();
        prog6();
        prog7();

    }

    public static int prog1(){

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int x = 0; x < arr.length; x++) {

            System.out.println("Enter number " + (x+1) + ": ");
            arr[x] = scanner.nextInt();

        }

        int lowest = arr[0];

        int nadr = 0; // Array length
        int xnth = 0;

        int sepr = 0; // sum
        int aepr = 0; // avg

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] > 0) {
                nadr++;
            } else if (arr[x] < 0) {
                xnth++;
            }

        }

        int[] repr = new int[nadr];
        int[] astr = new int[xnth];

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] < lowest) {
                lowest = arr[x];
            }

        }

        int poidx = 0;
        int neidx = 0;

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] > 0) {
                repr[poidx] = arr[x];
                poidx++;
            } else if (arr[x] < 0) {
                astr[neidx] = arr[x];
                neidx++;
            }

        }

        for (int x = 0; x < repr.length; x++) {
            
            sepr += repr[x]; // get sum            

        }

        aepr = (sepr / repr.length);

        System.out.println("The sum of positive values: " + sepr);
        System.out.println("The average of positive values: " + aepr);

        System.out.print("All negative values: ");

        for (int x = 0; x < astr.length; x++) {

            System.out.print(astr[x] + (astr.length != x ? ", " : ""));

        }


        return 0;

    }

    public static int prog2(){

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[8];

        for (int x = 0; x < arr.length; x++) {

            System.out.println("Enter number " + (x+1) + ": ");
            arr[x] = scanner.nextInt();

        }

        int[] dupl = new int[arr.length];
        int uniq = 0;

        for (int x = 0; x < arr.length; x++) {

            boolean found = false;

            for (int y = 0; y < uniq; y++) {

                if (dupl[y] == arr[x]) {
                    found = true;
                }

            }

            if (!found) {
                dupl[uniq] = arr[x];
                uniq++;
            }

        }

        System.out.print("Array without duplicates: ");

        for (int x = 0; x < uniq; x++) {

            System.out.print(dupl[x] + (x != uniq - 1 ? ", " : ""));

        }

        System.out.println();

        int lrgst = Integer.MIN_VALUE;
        int slrg = Integer.MIN_VALUE;

        for (int x = 0; x < uniq; x++) {

            if (dupl[x] > lrgst) {
                slrg = lrgst;
                lrgst = dupl[x];
            } else if (dupl[x] > slrg) {
                slrg = dupl[x];
            }

        }

        int smlst = Integer.MAX_VALUE;
        int ssml = Integer.MAX_VALUE;

        for (int x = 0; x < uniq; x++) {

            if (dupl[x] < smlst) {
                ssml = smlst;
                smlst = dupl[x];
            } else if (dupl[x] < ssml) {
                ssml = dupl[x];
            }

        }

        if (uniq < 2) {
            System.out.println("There is no second largest or second smallest element");
        } else {
            System.out.println("Second largest element: " + slrg);
            System.out.println("Second smallest element: " + ssml);
        }

        return 0;

    }

    public static int prog3(){

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter Data in Array: ");

        for (int x = 0; x < arr.length; x++) {

            arr[x] = scanner.nextInt();

        }

        System.out.print("Stored Data in Array: ");

        for (int x = 0; x < arr.length; x++) {

            System.out.print(arr[x] + (x != arr.length - 1 ? " " : ""));

        }

        System.out.println();

        System.out.print("Enter poss. of Element to Delete: ");
        int poss = scanner.nextInt();

        if (poss < 0 || poss >= arr.length) {

            System.out.println("Invalid position");
            return 0;

        }

        int[] nwar = new int[arr.length - 1];
        int nidx = 0;

        for (int x = 0; x < arr.length; x++) {

            if (x != poss) {
                nwar[nidx] = arr[x];
                nidx++;
            }

        }

        System.out.print("New data in Array: ");

        for (int x = 0; x < nwar.length; x++) {

            System.out.print(nwar[x] + (x != nwar.length - 1 ? " " : ""));

        }

        System.out.println();

        return 0;

    }

    public static int prog4(){

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter any " + size + " elements in Array: ");

        for (int x = 0; x < arr.length; x++) {

            arr[x] = scanner.nextInt();

        }

        System.out.print("Even Elements: ");

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] % 2 == 0) {
                System.out.print(arr[x] + " ");
            }

        }

        System.out.println();

        System.out.print("Odd Elements: ");

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] % 2 != 0) {
                System.out.print(arr[x] + " ");
            }

        }

        System.out.println();

        return 0;

    }

    public static int prog5(){

        System.out.println();

        for (int x = 0; x < 4; x++) {

            System.out.print("*");

            for (int y = 0; y < x; y++) {

                System.out.print("A*");

            }

            System.out.println();

        }

        return 0;

    }

    static class Student {

        private String studentNo;
        private String studentName;
        private LocalDate dateOfBirth;
        private int tariffPoints;

        static int noOfStudents = 0;

        public Student() {

            this.studentNo = "not known";
            this.studentName = "not known";
            this.dateOfBirth = LocalDate.parse("1995-01-01");
            this.tariffPoints = 20;

            noOfStudents++;

        }

        public Student(String studentNo, String studentName, LocalDate dateOfBirth, int tariffPoints) {

            setStudentNo(studentNo);
            setStudentName(studentName);
            setDateOfBirth(dateOfBirth);
            setTariffPoints(tariffPoints);

            noOfStudents++;

        }

        public String getStudentNo() {
            return studentNo;
        }

        public void setStudentNo(String studentNo) {

            if (studentNo == null || studentNo.trim().isEmpty()) {
                throw new IllegalArgumentException("Student number cannot be empty");
            }

            this.studentNo = studentNo;

        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {

            if (studentName == null || studentName.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty");
            }

            this.studentName = studentName;

        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {

            if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Invalid date of birth");
            }

            this.dateOfBirth = dateOfBirth;

        }

        public int getTariffPoints() {
            return tariffPoints;
        }

        public void setTariffPoints(int tariffPoints) {

            if (tariffPoints < 20 || tariffPoints > 280) {
                throw new IllegalArgumentException("Tariff points must be between 20 and 280");
            }

            this.tariffPoints = tariffPoints;

        }

        public static int getNoOfStudents() {
            return noOfStudents;
        }

        public void display() {

            System.out.println(studentNo + " | " + studentName + " | " + dateOfBirth + " | " + tariffPoints);

        }

    }

    public static int prog6(){

        System.out.println();

        Student first = new Student();
        Student second = new Student("2025-0001", "Kyann", LocalDate.parse("2005-06-15"), 150);

        first.display();
        second.display();

        System.out.println("Number of students: " + Student.getNoOfStudents());

        return 0;

    }

    public static int prog7() throws Exception {

        System.out.println();

        BufferedReader reader = new BufferedReader(new FileReader("emp.txt"));

        ArrayList<String[]> table = new ArrayList<>();

        String line = reader.readLine();

        while ((line = reader.readLine()) != null) {

            String[] data = line.split("\t|,");

            if (data.length < 3) {
                continue;
            }

            table.add(new String[] { data[0].trim(), data[1].trim(), data[2].trim() });

        }

        reader.close();

        System.out.printf("%-8s%-20s%-12s%n", "eno", "ename", "mobile");

        for (int x = 0; x < table.size(); x++) {

            System.out.printf("%-8s%-20s%-12s%n", table.get(x)[0], table.get(x)[1], table.get(x)[2]);

        }

        System.out.println("Records inserted: " + table.size());

        return 0;

    }


}