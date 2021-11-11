class Animal { // все классы являются наследниками класса Object

    private String name; // поля класса
    private int age; // поля класса
    private boolean gender = false; // поля класса
    private int foot = 4;
    private String coatColor;
    private double weight;

    public Animal(String name, int age, boolean gender, int foot, String coatColor, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.foot = foot;
        this.coatColor = coatColor;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name +
                ". Мне " + age + "лет. " +
                "Я " + gender +
                ". У меня " + foot + " лапы. " +
                "Моя шерсть " + coatColor + " цвета. " +
                "Я вешу " + weight + "кг.";
    }
}
