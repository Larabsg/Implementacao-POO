import java.lang.String;

public class ISBN {
    private String dig_1;
    private String dig_2;
    private String dig_3;
    private String dig_4;

    public void setISBN(String isbn) {
        this.dig_1 = isbn.substring(0, 1);
        this.dig_2 = isbn.substring(1, 7);
        this.dig_3 = isbn.substring(7, 9);
        this.dig_4 = isbn.substring(9);
    }

    public String getDig1() {
        return dig_1;
    }

    public String getDig2() {
        return dig_2;
    }

    public String getDig3() {
        return dig_3;
    }

    public String getDig4() {
        return dig_4;
    }
}
