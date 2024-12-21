
interface Animal {
    String makeSound();
    String getFood();
    void displayInfo();
}


class Dog implements Animal {
    @Override
    public String makeSound() {
        return "Гав!";
    }

    @Override
    public String getFood() {
        return "корм для собак";
    }

    @Override
    public void displayInfo() {
        System.out.println("Собака говорит - " + makeSound() + ", корм для собаки - " + getFood());
    }
}


class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Мяу!";
    }

    @Override
    public String getFood() {
        return "сухой или мокрый корм";
    }

    @Override
    public void displayInfo() {
        System.out.println("Кот говорит - " + makeSound() + ", корм для котов " + getFood());
    }
}


class Bird implements Animal {
    @Override
    public String makeSound() {
        return "чирик!";
    }

    @Override
    public String getFood() {
        return "пшено";
    }

    @Override
    public void displayInfo() {
        System.out.println("Птичка говорит - " + makeSound() + ", корм птичек - " + getFood());
    }
}
