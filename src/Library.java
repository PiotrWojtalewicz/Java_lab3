public class Library {
    protected String subject;
    protected String title;
    protected int quantity;
    protected boolean recomended;


    public Library() {
        this.subject = "";
        this.title = "";
        this.quantity = 0;
        this.recomended = true;
    }

    public Library(String subject, String title, int quantity) {
        this.subject = subject;
        this.title = title;
        this.quantity = quantity;
        recomended = true;

    }
        protected int HowMuchInStock() {
            return this.quantity;
        }

        /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
        @Override
        public String toString() {
            return "Library: {" +
                    "subject='" + subject + '\'' +
                    ", title='" + title + '\'' +
                    ", recomende='" + (recomended ? "Yes" : "No") + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }



