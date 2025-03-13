public class Main {
    public static void main(String[] args) {
        PC[] pcs1 = {
            new PC("1", "Core i5 8th Gen", 16, 512),
            new PC("2", "Core i5 10th Gen", 16, 1024),
            new PC("3", "Core i5 6th Gen", 16, 256),
            new PC("4", "Core i5 5th Gen", 4, 256)
        };

        PC[] pcs2 = {
            new PC("1", "Core i5 8th Gen", 16, 512),
            new PC("2", "Core i5 10th Gen", 16, 1024),
            new PC("3", "Core i5 6th Gen", 16, 256),
            new PC("4", "Core i5 5th Gen", 4, 256)
        };

        Lab[] labs1 = {
            new Lab("C-1", "Ali", 20, pcs1),
            new Lab("C-2", "Ahmed", 20, pcs2)
        };

        Department[] departments = {
            new Department("Computer Science", new Person("Yar Muhammad Awaim", "HOD"), labs1)
        };

        Campus campus = new Campus("CUI Lahore", "Dr. Muhammad Shahid Bhatti", "Defence Road, Lahore", departments);

        System.out.println(campus);
    }
}
