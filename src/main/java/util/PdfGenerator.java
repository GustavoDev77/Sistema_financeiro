package util;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

public class PdfGenerator {
    public static void gerarRelatorio(String nomeArquivo, String conteudo) {
        try {
            PdfWriter writer = new PdfWriter(nomeArquivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Simulação de Financiamento"));
            document.add(new Paragraph(conteudo));

            document.close();
            System.out.println("PDF gerado com sucesso: " + nomeArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
