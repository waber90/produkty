package pl.sda.shop.products;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Long iloscProduktow;
    private String adresZamowienia;
    private String koszt;

        Long getId() {
            return id;
        }

        void setId(Long id) {
            this.id = id;
        }
        public Long getIloscProduktow() {
            return iloscProduktow;
        }

        public void setIloscProduktow(Long iloscProduktow) {
            this.iloscProduktow = iloscProduktow;
        }

        public String getAdresZamowienia() {
            return adresZamowienia;
        }

        public void setAdresZamowienia(String name) {
            this.adresZamowienia = name;
        }

        public String getKoszt() {
            return koszt;
        }

        public void setKoszt(String koszt) {
            this.koszt = koszt;
        }

}
1