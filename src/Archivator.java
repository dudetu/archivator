import java.util.List;

// Абстрактный класс архиватора
abstract class Archivator {
    public abstract void archive(String filename);
    public abstract void dearchive(String filename);
}

// Класс ZIP архиватора
class ZIPArchivator extends Archivator {
    @Override
    public void archive(String filename) {
        System.out.println("Архивируем файл " + filename + " в формате ZIP");
    }

    @Override
    public void dearchive(String filename) {
        System.out.println("Разархивируем файл " + filename + " в формате ZIP");
    }
}

// Класс RAR архиватора
class RARArchivator extends Archivator {
    @Override
    public void archive(String filename) {
        System.out.println("Архивируем файл " + filename + " в формате RAR");
    }

    @Override
    public void dearchive(String filename) {
        System.out.println("Разархивируем файл " + filename + " в формате RAR");
    }
}

// Класс сервиса архиваторов
class ArchivatorService {
    // Метод для вывода списка архиваторов
    public void printArchivators(List<Archivator> archivators) {
        for (Archivator archivator : archivators) {
            System.out.println(archivator.getClass().getSimpleName());
        }
    }

    // Метод для добавления нового архиватора в список
    public void addArchivator(List<? super Archivator> archivators, Archivator archivator) {
        archivators.add(archivator);
    }
}

