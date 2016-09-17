package com.tommyputranto.cafe_api.dao;

import java.util.List;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeListDao extends BaseApiDao {

    /**
     * STATUS : true
     * STATUS_CODE : 200
     * MESSAGE : {"PROD":"Data found","DEVEL":"Data found"}
     * DATA : [{"id":"1","rating":"3","nama":"The Kiosk","jenis":"Food Court","alamat":"jl. Cihampelas no 160","url_foto":"http://dev.gits.co.id/apicafe/public/assets/the-kiosk.jpg","location":{"latitude":["-6.895104"],"longitude":["107.604346"]}},{"id":"2","rating":"2","nama":"9 Square Bar & Resto","jenis":"Bar & resto","alamat":"Jl. Sulanjana No 9, Dago","url_foto":"http://dev.gits.co.id/apicafe/public/assets/9square.jpg","location":{"latitude":["-6.899695"],"longitude":["107.611865"]}},{"id":"3","rating":"4","nama":"Bober","jenis":"Cafe","alamat":"jl. r.e. martadinata no. 123","url_foto":"http://dev.gits.co.id/apicafe/public/assets/Bober.jpg","location":{"latitude":["-6.907266"],"longitude":["107.623337"]}},{"id":"4","rating":"3","nama":"Upper East","jenis":"Cafe","alamat":"Jl. Cigadung Raya No.92, Jl. Raya Golf Dago, Jawa Barat","url_foto":"http://dev.gits.co.id/apicafe/public/assets/Upper-East.jpg","location":{"latitude":["-6.865074"],"longitude":["107.626472"]}},{"id":"5","rating":"5","nama":"The Peak","jenis":"Dining resto","alamat":"Jln Desa Karyawangi KM 6.8 No 388 Ciwaruga,Parongpong Bandung Barat","url_foto":"http://dev.gits.co.id/apicafe/public/assets/the-peak.jpg","location":{"latitude":["-6.818037"],"longitude":["107.581584"]}},{"id":"6","rating":"3","nama":"Roemah Kopi","jenis":"Cafe","alamat":"Jalan Terisan Ranca Kendal No 9, Dago Atas, Bandung","url_foto":"http://dev.gits.co.id/apicafe/public/assets/roemah-kopi.jpg","location":{"latitude":["-6.870689"],"longitude":["107.628441"]}},{"id":"7","rating":"4","nama":"HDL 293 Cilaki","jenis":"Restoran","alamat":"Jl Cilaki No 36-37 Bandung","url_foto":"http://dev.gits.co.id/apicafe/public/assets/HDL-cilaki.jpg","location":{"latitude":["-6.905336"],"longitude":["107.627559"]}},{"id":"8","rating":"5","nama":"Armor Kopi","jenis":"Coffe Cafe","alamat":"Taman Hutan Raya ( Tahura ) Ir.H.Djuanda Cimenyan Dago Bandung utara, Indonesia.","url_foto":"http://dev.gits.co.id/apicafe/public/assets/Armor-Kopi.jpg","location":{"latitude":["-6.858106"],"longitude":["107.630472"]}},{"id":"9","rating":"3","nama":"Mocktail Cafe","jenis":"Cafe","alamat":"Jl. Gelap Nyawang 3","url_foto":"http://dev.gits.co.id/apicafe/public/assets/Mocktail.jpg","location":{"latitude":["-6.894745"],"longitude":["107.610238"]}},{"id":"10","rating":"5","nama":"Rumah Miring","jenis":"Cafe","alamat":"Dago Giri 119, Bandung","url_foto":"http://dev.gits.co.id/apicafe/public/assets/Rumah-miring.jpg","location":{"latitude":["-6.851938"],"longitude":["107.624519"]}}]
     */

    private boolean STATUS;
    private int STATUS_CODE;
    /**
     * PROD : Data found
     * DEVEL : Data found
     */

    private MESSAGEBean MESSAGE;
    /**
     * id : 1
     * rating : 3
     * nama : The Kiosk
     * jenis : Food Court
     * alamat : jl. Cihampelas no 160
     * url_foto : http://dev.gits.co.id/apicafe/public/assets/the-kiosk.jpg
     * location : {"latitude":["-6.895104"],"longitude":["107.604346"]}
     */

    private List<DATABean> DATA;

    public boolean isSTATUS() {
        return STATUS;
    }

    public void setSTATUS(boolean STATUS) {
        this.STATUS = STATUS;
    }

    public int getSTATUS_CODE() {
        return STATUS_CODE;
    }

    public void setSTATUS_CODE(int STATUS_CODE) {
        this.STATUS_CODE = STATUS_CODE;
    }

    public MESSAGEBean getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(MESSAGEBean MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public List<DATABean> getDATA() {
        return DATA;
    }

    public void setDATA(List<DATABean> DATA) {
        this.DATA = DATA;
    }

    public static class MESSAGEBean {
        private String PROD;
        private String DEVEL;

        public String getPROD() {
            return PROD;
        }

        public void setPROD(String PROD) {
            this.PROD = PROD;
        }

        public String getDEVEL() {
            return DEVEL;
        }

        public void setDEVEL(String DEVEL) {
            this.DEVEL = DEVEL;
        }
    }

    public static class DATABean {
        private String id;
        private String rating;
        private String nama;
        private String jenis;
        private String alamat;
        private String url_foto;
        private LocationBean location;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJenis() {
            return jenis;
        }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getUrl_foto() {
            return url_foto;
        }

        public void setUrl_foto(String url_foto) {
            this.url_foto = url_foto;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public static class LocationBean {
            private List<String> latitude;
            private List<String> longitude;

            public List<String> getLatitude() {
                return latitude;
            }

            public void setLatitude(List<String> latitude) {
                this.latitude = latitude;
            }

            public List<String> getLongitude() {
                return longitude;
            }

            public void setLongitude(List<String> longitude) {
                this.longitude = longitude;
            }
        }
    }
}
