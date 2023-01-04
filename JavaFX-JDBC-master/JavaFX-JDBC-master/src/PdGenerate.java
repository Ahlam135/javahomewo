import java.io.FileOutputStream;

public class PdGenerate {
    try{
        Document document=new Document();
        PifWriter.getInstance(document,new FileOutputStream("/AHLAM"));
    }
}
