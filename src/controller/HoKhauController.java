
package controller;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.HoKhau;
import service.HoKhauService;
import service.HoKhauServiceImpl;

/**
 *
 * @author admin
 */
public class HoKhauController {
    private JTextField jtfIDHoKhau;
    private JTextField jtfIDMaHoKhau;
    private JTextField jtfHoTen;
    private JButton btnSubmit;
    private JTextArea jtaNoiHoKhau;
    private JTextField jtfDaKiemTra;
    private JTextField jtfMucDoHoKhau;
    private JDateChooser jdcThoiGianBatDau;
    private JLabel jlbMsg;
    private HoKhau hoKhau = null;
    private HoKhauService hoKhauService = null;

    public HoKhauController(JTextField jtfIDCachLy, JTextField jtfIDNhanKhau, JTextField jtfHoTen, JButton btnSubmit, 
            JTextField jtfDaKiemTra, JTextArea jtaNoiCachLy, JTextField jtfMucDoCachLy,
            JDateChooser jdcThoiGianBatDau, JLabel jlbMsg) {
        this.jtfIDCachLy = jtfIDCachLy;
        this.jtfIDNhanKhau = jtfIDNhanKhau;
        this.jtfHoTen = jtfHoTen;
        this.btnSubmit = btnSubmit;
        this.jtfDaKiemTra = jtfDaKiemTra;
        this.jtfMucDoCachLy = jtfMucDoCachLy;
        this.jtaNoiCachLy = jtaNoiCachLy;
        this.jdcThoiGianBatDau = jdcThoiGianBatDau;
        this.jlbMsg = jlbMsg;
        this.cachLyService = new CachLyServiceImpl();
    }


    public void setView(Hokhau hoKhau){
        this.hoKhau = hoKhau;
        jtfIDCachLy.setText("#" + hoKhau.getIDCachLy());
        jtfIDNhanKhau.setText("#" + hoKhau.getIDNhanKhau());
        jtfHoTen.setText(hoKhau.getHoTen());
        jdcThoiGianBatDau.setDate(hoKhau.getThoiGianBatDau());
        jtfMucDoCachLy.setText(hoKhau.getMucDoCachLy());
        jtaNoiCachLy.setText(hoKhau.getNoiCachLy());
        jtfDaKiemTra.setText(hoKhau.getDaKiemTra());
    }
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jtfHoTen.getText().length() == 0 || jtaNoiCachLy.getText() == null){
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                }
                else{
                    cachLy.setHoTen(jtfHoTen.getText());
                    cachLy.setThoiGianBatDau((java.sql.Date) new Date(jdcThoiGianBatDau.getDate().getTime()));
                    cachLy.setMucDoCachLy(jtfMucDoCachLy.getText());
                    cachLy.setNoiCachLy(jtaNoiCachLy.getText());
                    cachLy.setDaKiemTra(jtfDaKiemTra.getText());
                    int lastID = cachLyService.createOrUpdate(cachLy);
                    if (lastID > 0){
                    cachLy.setIDCachLy(lastID);
                    jtfIDCachLy.setText("#" + lastID);
                    jlbMsg.setText("Thêm Mới Dữ Liệu Thành Công");
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));

            }
            
            
        });
    }
    
}
