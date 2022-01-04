public class Library {
    protected String subject;
    protected String title;
    protected int quantity;
    protected boolean recomende;


    public Library() {
        this.subject = "";
        this.title = "";
        this.quantity = 0;
        this.recomende = true;
    }

    public Library(String subject, String title, int quantity) {
        this.subject = subject;
        this.title = title;
        this.quantity = quantity;
        recomende = true;
    }
    }


