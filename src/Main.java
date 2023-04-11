import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
            ZIPArchivator zipArchivator = new ZIPArchivator();
            RARArchivator rarArchivator = new RARArchivator();
            List<Archivator> archivators = new ArrayList<>();
            archivators.add(zipArchivator);
            archivators.add(rarArchivator);

            ArchivatorService archivatorService = new ArchivatorService();
            // Вывод списка архиваторов
            archivatorService.printArchivators(archivators);
            // Добавление нового архиватора
            archivatorService.addArchivator(archivators, new ZIPArchivator());
        }





    }
