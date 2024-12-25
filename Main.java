import ru.p3xi.lab3.*;
import java.util.Random;
import java.util.ArrayList;

public final class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

        String guns[] = {"Huglu 103", "МР-27ЕМ", "CZ MALLARD", "CZ MALLARD GEN 2", "Вепрь 12"};
        String hadnguns[] = {"BORNER W3000М", " МР-651К", "Walther PPS", "Stoeger XP4", "Ekol ES P66С Black"};
        String knifes[] = {"WKL Арлекин", "НОКС Майор-Н", "CJRB Pyrite Bowie", "CJRB Breeze"};
        String daggers[] = {"Кизляр", "бебут", "К-01", "Ятаган"};
        Caliber calibers[] = {Caliber.MM45, Caliber.MM9, Caliber.MM10, Caliber.MM57x28, Caliber.MM76x39, Caliber.MM76x51};
        String colors[] = {"белый", "коричневый", "черный", "рыжий"};
        MaskType masks[] = {MaskType.TopFace, MaskType.EyesSlot, MaskType.FullHead};

        for(int i=0; i<rand.nextInt(5)+4; i++) {
            Stands stands = new Stands();
            stands.standOn(new Gun(calibers[rand.nextInt(3)+3], guns[rand.nextInt(5)]));
            furnitures.add(stands);
        }
        
        Bar bar = new Bar();

        for(int i=0; i<rand.nextInt(3)+2; i++) {
            bar.standOn(new Handgun(calibers[rand.nextInt(3)], hadnguns[rand.nextInt(5)]));
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            bar.standOn(new Knife(knifes[rand.nextInt(4)]));
        }
        for(int i=0; i<rand.nextInt(2)+2; i++) {
            bar.standOn(new Finca());
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            bar.standOn(new Dagger(daggers[rand.nextInt(4)]));
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            bar.standOn(new Flail());
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            bar.standOn(new Knuckles());
        }
        furnitures.add(bar);

        Showcase showcase0 = new Showcase("Приспособления для взлома");

        showcase0.standOn(new UnlockTools("набор воровских отмычек"));
        showcase0.standOn(new UnlockTools("набор воровских отмычек"));
        showcase0.standOn(new UnlockTools("стальная пилочка"));
        for(int i=0; i<rand.nextInt(5)+2; i++) {
            showcase0.standOn(new UnlockTools("сверло"));
        }
        showcase0.standOn(new UnlockTools("клещи"));
        showcase0.standOn(new UnlockTools("кусачки"));
        showcase0.standOn(new UnlockTools("ломик"));
        showcase0.standOn(new UnlockTools("автогенный аппарат"));
        furnitures.add(showcase0);

        Showcase showcase1 = new Showcase("Полицейская утварь");

        for(int i=0; i<rand.nextInt(3)+2; i++) {
            showcase1.standOn(new SteelHandcuffs());
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            showcase1.standOn(new Shackles());
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            showcase1.standOn(new Incendiary());
        }
        for(int i=0; i<rand.nextInt(3)+2; i++) {
            showcase1.standOn(new TearGas());
        }
        furnitures.add(showcase1);

        Showcase showcase2 = new Showcase("Маски");

        for(int i=0; i<rand.nextInt(5)+5; i++) {
            showcase2.standOn(new Mask(masks[rand.nextInt(3)]));
        }
        for(int i=0; i<rand.nextInt(2)+1; i++) {
            showcase2.standOn(new FakeMoustaches(colors[rand.nextInt(4)]));
        }
        for(int i=0; i<rand.nextInt(2)+1; i++) {
            showcase2.standOn(new FakeBeards(colors[rand.nextInt(4)]));
        }
        for(int i=0; i<rand.nextInt(2)+1; i++) {
            showcase2.standOn(new Wig(colors[rand.nextInt(4)]));
        }
        for(int i=0; i<rand.nextInt(1)+1; i++) {
            showcase2.standOn(new Make(colors[0]));
        }
        furnitures.add(showcase2);

        Room shopRoom = new Room(furnitures, "магазин");

        Neznaika neznaika = new Neznaika();
        neznaika.lookAround(shopRoom);
    }
}