public class Student extends Person {

    private int solvedTasks;
    private boolean isAllTasksDone;
    private static int totalSolvedTasks;

    public Student(String name, String surname, int age, boolean isAllTasksDone) {
        this(name,
                surname,
                age,
                isAllTasksDone,
                0);
    }

    public Student(String name, String surname, int age, boolean isAllTasksDone, int solvedTasks) {
        super(name, surname, age);
        this.isAllTasksDone = isAllTasksDone;
        this.solvedTasks = solvedTasks;
    }

    public int getSolvedTasks() {
        return solvedTasks;
    }

    public void setSolvedTasks(int solvedTasks) {
        this.solvedTasks = solvedTasks;
    }

    public boolean isAllTasksDone() {
        return isAllTasksDone;
    }

    public void setAllTasksDone(boolean allTasksDone) {
        isAllTasksDone = allTasksDone;
    }
}
