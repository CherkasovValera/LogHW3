public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите Фамилию, Имя, Отчество, Дату рождения, Номер телефона, Пол.\n" +
                "Ввод даных через пробел, Дата рождения вводится в формате dd.mm.yyyy," +
                " Номер телефон - вводится только цифры, Пол - f или m");
        String dataInput = InputDate.handInput();
        SaveDate.saveFile(InputDate.parseData(dataInput));

    }
}