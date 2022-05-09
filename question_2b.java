public int toplamPuan(){
    int toplam = 0;
    
    for (Soru soru : sorular) {
    toplam += soru.getPuan();
    }
    return toplam;
    }