package homework14.task_3_2;


public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        AbstractOpener docOpener = new DOCOpener();
        AbstractOpener docxOpener = new DOCXOpener();
        AbstractOpener jpgOpener = new JPGOpener();
        AbstractOpener pdfOpener = new PDFOpener();
        AbstractOpener pngOpener = new PNGOpener();
        AbstractOpener pptxOpener = new PPTXOpener();
        AbstractOpener xlsOpener = new XLSOpener();
        AbstractOpener xlsxOpener = new XLSXOpener();

        docOpener.setNextOpener(docxOpener);
        docxOpener.setNextOpener(jpgOpener);
        jpgOpener.setNextOpener(pdfOpener);
        pdfOpener.setNextOpener(pngOpener);
        pngOpener.setNextOpener(pptxOpener);
        pptxOpener.setNextOpener(xlsOpener);
        xlsOpener.setNextOpener(xlsxOpener);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            docOpener.openFile(file);
        }


    }
}
