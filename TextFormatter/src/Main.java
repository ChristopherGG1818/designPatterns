import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("The first authoer whose articles were most frequently selected in this random");
        data.add("The two intrucstions --");
        data.add("he authors of the articles in the selected sample represented ");
        data.add(" 242 institustions, 207 were universities or colleges; 24 were technical ");
        data.add(" technology, ot polytechnics; and 11 were types of organizations, ");

        TextFile file = new TextFile(data);
        int option;
        switch (option){
            case 0:
            file.printPlainText(new PlainTextFormat());
                break;

            case 1:
                file.printHTML(new HTMLFormat());
                break;
            case 2:
                file.printMarkdown(new MarkdownFormat());

            default:
                file.printPlainText(new PlainTextFormat());
                break;

        }
        file.printFormatted();
    }
}