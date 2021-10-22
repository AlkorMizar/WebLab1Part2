package by.bsuir.lab.part2.classes;

import java.util.Objects;

public class ProgrammerBook  extends Book{
    private String language;
    private int level;

    @Override
    public  String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(super.toString());
        String string="language='"+language+"' ,level="+level;
        builder.insert(builder.lastIndexOf("}"),string);
        return  builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgrammerBook)) return false;
        var book = (ProgrammerBook) o;
        return super.equals(o)&&
               book.language.equals(language) &&
               book.level==level;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(),language,level);
    }
}
