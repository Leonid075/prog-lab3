package ru.p3xi.lab3;

public class Mask extends PoliceTool {
    protected MaskType type;

    public Mask(MaskType type){
        this.type = type;
        this.name = "маска";
    }

    public void lookOn(String watcher, String where) {
        String typeString = "";
        switch (type){
            case TopFace:
                typeString = "закрывающая верхнюю часть лица";
                break;
            case EyesSlot:
                typeString = "с прорезью для глаз";
                break;
            case FullHead:
                typeString = "закрывающая всю голову";
                break;
        }
        System.out.println(watcher + " видит" + " " + name + " " + typeString + " " + where);
    }
}
