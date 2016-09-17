package com.tommyputranto.cafe_api.dao;

import java.util.List;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailDao extends BaseApiDao {

    /**
     * STATUS : true
     * STATUS_CODE : 200
     * MESSAGE : {"PROD":"Data Found","DEVEL":"Data Found"}
     * DATA : {"nama":"9 Square Bar & Resto","location":{"latitude":["-6.899695"],"longitude":["107.611865"]},"alamat":"Jl. Sulanjana No 9, Dago","deskripsi":"9 SQUARE Bar & Resto adalah salah satu tempat nongkrong dan hangout yang cozy di kota Bandung. Berdiri sejak 2010 dengan konsep Club dan ChillOut Menghadirkan suasana hangout dengan entertainment DJ setiap hari.Dengan nuansa resto yang lebih homy dan table full sofa, tentunya memberikan kesan serta pengalaman berbeda bagi anda.","fasilitas":[{"nama":"free wifi"},{"nama":" reservation call"}]}
     */

    private boolean STATUS;
    private int STATUS_CODE;
    /**
     * PROD : Data Found
     * DEVEL : Data Found
     */

    private MESSAGEBean MESSAGE;
    /**
     * nama : 9 Square Bar & Resto
     * location : {"latitude":["-6.899695"],"longitude":["107.611865"]}
     * alamat : Jl. Sulanjana No 9, Dago
     * deskripsi : 9 SQUARE Bar & Resto adalah salah satu tempat nongkrong dan hangout yang cozy di kota Bandung. Berdiri sejak 2010 dengan konsep Club dan ChillOut Menghadirkan suasana hangout dengan entertainment DJ setiap hari.Dengan nuansa resto yang lebih homy dan table full sofa, tentunya memberikan kesan serta pengalaman berbeda bagi anda.
     * fasilitas : [{"nama":"free wifi"},{"nama":" reservation call"}]
     */

    private DATABean DATA;

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

    public DATABean getDATA() {
        return DATA;
    }

    public void setDATA(DATABean DATA) {
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
        private String nama;
        private LocationBean location;
        private String alamat;
        private String deskripsi;
        /**
         * nama : free wifi
         */

        private List<FasilitasBean> fasilitas;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getDeskripsi() {
            return deskripsi;
        }

        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public List<FasilitasBean> getFasilitas() {
            return fasilitas;
        }

        public void setFasilitas(List<FasilitasBean> fasilitas) {
            this.fasilitas = fasilitas;
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

        public static class FasilitasBean {
            private String nama;

            public String getNama() {
                return nama;
            }

            public void setNama(String nama) {
                this.nama = nama;
            }
        }
    }
}
