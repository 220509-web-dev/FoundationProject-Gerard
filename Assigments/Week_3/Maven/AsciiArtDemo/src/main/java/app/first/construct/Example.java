package app.first.construct;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Example
{

        public static void main(String[] args) {
            String greeting = "H e l l o N u r s e !";

            try {
                String asciiArt = FigletFont.convertOneLine(greeting);
                System.out.print(asciiArt);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }



}

