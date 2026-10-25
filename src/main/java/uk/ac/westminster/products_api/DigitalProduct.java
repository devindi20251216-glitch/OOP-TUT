package uk.ac.westminster.products_api;
//TUT 04

public class DigitalProduct extends Product {//extends is the inheritance
    private String downloadUrl;
    private double filesizeMB;

    public DigitalProduct(){//No argument constructor

    }

    //parametarized constructor
        public DigitalProduct(Long id,String name,double price,String downloadUrl,double filesizeMB){
        super(id,name,price);

        this.downloadUrl=downloadUrl;
        this.filesizeMB=filesizeMB;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFilesizeMB() {
        return filesizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFilesizeMB(double filesizeMB) {
        this.filesizeMB = filesizeMB;
    }
}
