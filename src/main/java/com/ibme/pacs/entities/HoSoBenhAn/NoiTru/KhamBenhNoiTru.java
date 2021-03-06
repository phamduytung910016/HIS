package com.ibme.pacs.entities.HoSoBenhAn.NoiTru;

import com.ibme.pacs.entities.HoSoBenhAn.HoSoBenhAn;
import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class KhamBenhNoiTru extends HoSoBenhAn {
    private String tuanHoan;
    private String hoHap;
    private String tieuHoa;
    private String thanTietNieuSinhDuc;
    private String thanKinh;
    private String coXuongKhop;
    private String taiMaiHong;
    private String rangHamMat;
    private String mat;
    private String xetNghiemCanLamSang;
    private String tomTatBenhAn;
}
