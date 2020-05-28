/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacionesbasicaspetroleo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author HoracioH
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    //DECLARAMOS LAS VARIABLES;
    public String TXT_presion_yacimiento;
    public String TXT_presion_burbuja;
    public String TXT_densidad_petroleo;
    public String TXT_gravedad_especifica_petroleo;
    public String TXT_gravedad_especifica_gas;
    public String TXT_relacion_gas_petroleo;
    public String TXT_temperatura;
    public String TXT_gravedad_API;
    public String TXT_viscosidad_cp;
    public double presion_yacimiento;
    public double presion_burbuja;
    public double densidad_petroleo ;
    public double gravedad_especifica_petroleo;
    public double gravedad_especifica_gas;
    public double relacion_gas_petroleo;
    public double temperatura;
    public double gravedad_API;
    public double viscosidad_cp;
    public double ro;
    public double gravedad_especifica;
    public double poStanding, poAhmed;
    public double API;
    public double aBeal, aGlasso,aViscosidad;
    public double uodBeal, uodBegggs,uodGlasso;
    public double vx, vy, z;
    public double eChew,dChew,cChew,bChew;
    public double bBegggs, aBegggs;
    public double uobViscosidadChew1, uobViscosidadChew2, uobViscosidadChew3;
    public double uobViscosidadBegggs1, uobViscosidadBegggs2, uobViscosidadBegggs3;
    public double Bo;
    public double a1,a2,a3,a4,a5;
    public double Co;
    public double Pb;
    //CLASE PRINCIPAL DONDE INICIA TODOS LOS OBJETOS
    public Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label8 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Jtxt_Relacion_gas_petroleo = new javax.swing.JTextPane();
        label6 = new java.awt.Label();
        jScrollPane8 = new javax.swing.JScrollPane();
        Jtxt_Gravedad_API = new javax.swing.JTextPane();
        lbl_beggs = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        lbl_Vazquez_Beggs = new java.awt.Label();
        label9 = new java.awt.Label();
        label7 = new java.awt.Label();
        label4 = new java.awt.Label();
        jScrollPane9 = new javax.swing.JScrollPane();
        Jtxt_Viscosidad_cp = new javax.swing.JTextPane();
        Jlbl_tipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        compresibilidad = new java.awt.Label();
        jScrollPane4 = new javax.swing.JScrollPane();
        Jtxt_Gravedad_especifica_petroleo = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        Jtxt_Temperatura = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Jbtn_verificar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtxt_presion_yacimiento = new javax.swing.JTextPane();
        label3 = new java.awt.Label();
        label10 = new java.awt.Label();
        jScrollPane5 = new javax.swing.JScrollPane();
        Jtxt_Gravedad_especifica_gas = new javax.swing.JTextPane();
        label5 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtxt_presion_burbuja = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Jtxt_densidad_petroleo = new javax.swing.JTextPane();
        Metodo2_densidad1 = new java.awt.Label();
        Metodo1_densidad1 = new java.awt.Label();
        lbl_Ahmed = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        Metodo1_densidad2 = new java.awt.Label();
        Metodo2_densidad2 = new java.awt.Label();
        Metodo2_densidad3 = new java.awt.Label();
        lbl_standding1 = new java.awt.Label();
        lbl_chew = new java.awt.Label();
        lbl_begggs_robinson = new java.awt.Label();
        label13 = new java.awt.Label();
        Metodo1_densidad3 = new java.awt.Label();
        Metodo2_densidad4 = new java.awt.Label();
        Metodo1_densidad4 = new java.awt.Label();
        Metodo1_densidad5 = new java.awt.Label();
        Metodo1_densidad6 = new java.awt.Label();
        label14 = new java.awt.Label();
        Metodo3_densidad = new java.awt.Label();
        lbl_presion_burbuja = new java.awt.Label();
        Metodo1_densidad9 = new java.awt.Label();
        lbl_gravedad_especifica = new java.awt.Label();
        factor_volumetrico = new java.awt.Label();
        lbl_beal_muerto1 = new java.awt.Label();
        lbl_begggs_muerto1 = new java.awt.Label();
        lbl_glasso1 = new java.awt.Label();
        lbl_beal1 = new java.awt.Label();
        lbl_khan = new java.awt.Label();
        lbl_chew1 = new java.awt.Label();
        lbl_chew2 = new java.awt.Label();
        lbl_begggs_robinson1 = new java.awt.Label();
        lbl_begggs_robinson2 = new java.awt.Label();
        lbl_beal2 = new java.awt.Label();
        lbl_beal3 = new java.awt.Label();
        lbl_khan1 = new java.awt.Label();
        lbl_khan2 = new java.awt.Label();
        lbl_beggs1 = new java.awt.Label();
        lbl_beggs2 = new java.awt.Label();
        label15 = new java.awt.Label();
        lbl_API = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operaciones Basicas Petroleo");

        panel1.setLayout(null);

        label8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label8.setText("Compresibilidad ");
        panel1.add(label8);
        label8.setBounds(20, 30, 152, 28);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jtxt_Relacion_gas_petroleo.setText("0");
        jScrollPane6.setViewportView(Jtxt_Relacion_gas_petroleo);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 217, 53, -1));

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Gravedad API:");
        jPanel2.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 311, -1, -1));

        Jtxt_Gravedad_API.setText("0");
        jScrollPane8.setViewportView(Jtxt_Gravedad_API);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 309, 53, -1));

        lbl_beggs.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beggs.setForeground(new java.awt.Color(102, 102, 0));
        lbl_beggs.setText("0");
        jPanel2.add(lbl_beggs, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 358, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Datos:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 22, -1, -1));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Gravedad especifica del gas:");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 187, -1, -1));

        lbl_Vazquez_Beggs.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_Vazquez_Beggs.setForeground(new java.awt.Color(0, 51, 51));
        lbl_Vazquez_Beggs.setText("0");
        jPanel2.add(lbl_Vazquez_Beggs, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 367, 150, -1));

        label9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label9.setText("Gravedad API");
        jPanel2.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 417, 130, -1));

        label7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label7.setText("Presion de burbuja pb:");
        jPanel2.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 417, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Relacion gas petroleo:");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 217, -1, -1));

        Jtxt_Viscosidad_cp.setText("0");
        jScrollPane9.setViewportView(Jtxt_Viscosidad_cp);

        jPanel2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 341, 53, -1));

        Jlbl_tipo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Jlbl_tipo.setForeground(new java.awt.Color(204, 0, 0));
        Jlbl_tipo.setText("...");
        jPanel2.add(Jlbl_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("po:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 97, -1, -1));

        compresibilidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        compresibilidad.setForeground(new java.awt.Color(0, 0, 0));
        compresibilidad.setText("0");
        jPanel2.add(compresibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 527, 181, -1));

        Jtxt_Gravedad_especifica_petroleo.setText("0");
        jScrollPane4.setViewportView(Jtxt_Gravedad_especifica_petroleo);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 153, 53, -1));

        Jtxt_Temperatura.setText("0");
        Jtxt_Temperatura.setToolTipText("");
        jScrollPane7.setViewportView(Jtxt_Temperatura);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 277, 53, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pb");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 64, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("P");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 64, -1, -1));

        Jbtn_verificar.setText("Verificar");
        Jbtn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_verificarActionPerformed(evt);
            }
        });
        jPanel2.add(Jbtn_verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 64, -1, -1));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Gravedad especifica del petroleo:");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        Jtxt_presion_yacimiento.setText("0");
        jScrollPane1.setViewportView(Jtxt_presion_yacimiento);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 64, 53, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Viscosidad del petroleo muerto:");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 343, -1, -1));

        label10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label10.setName(""); // NOI18N
        label10.setText("Viscosidad");
        jPanel2.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 10, -1, -1));

        Jtxt_Gravedad_especifica_gas.setText("0");
        jScrollPane5.setViewportView(Jtxt_Gravedad_especifica_gas);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 187, 53, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Temperatura:");
        jPanel2.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 279, -1, -1));

        Jtxt_presion_burbuja.setText("1");
        jScrollPane2.setViewportView(Jtxt_presion_burbuja);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 64, 53, -1));

        Jtxt_densidad_petroleo.setText("0");
        jScrollPane3.setViewportView(Jtxt_densidad_petroleo);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 97, 53, -1));

        Metodo2_densidad1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo2_densidad1.setForeground(new java.awt.Color(0, 153, 153));
        Metodo2_densidad1.setText("Correlacion de Glasso:");
        jPanel2.add(Metodo2_densidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 307, 150, -1));

        Metodo1_densidad1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad1.setForeground(new java.awt.Color(0, 0, 255));
        Metodo1_densidad1.setText("Correlacion de Chew-Connaly:");
        jPanel2.add(Metodo1_densidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 67, 180, -1));

        lbl_Ahmed.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_Ahmed.setForeground(new java.awt.Color(255, 51, 0));
        lbl_Ahmed.setText("0");
        jPanel2.add(lbl_Ahmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 307, 150, -1));

        label11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label11.setText("Gravedad especifica:");
        jPanel2.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 497, -1, -1));

        label12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label12.setText("Compresibilidad");
        jPanel2.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 487, -1, -1));

        Metodo1_densidad2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad2.setForeground(new java.awt.Color(153, 0, 0));
        Metodo1_densidad2.setText("Correlacion de Standding:");
        jPanel2.add(Metodo1_densidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 187, -1, -1));

        Metodo2_densidad2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo2_densidad2.setForeground(new java.awt.Color(255, 51, 0));
        Metodo2_densidad2.setText("Correlacion de Ahmed:");
        jPanel2.add(Metodo2_densidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 277, 150, -1));

        Metodo2_densidad3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo2_densidad3.setForeground(new java.awt.Color(204, 0, 153));
        Metodo2_densidad3.setText("Correlacion de Begggs-Robinson:");
        jPanel2.add(Metodo2_densidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 126, 200, -1));

        lbl_standding1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_standding1.setForeground(new java.awt.Color(153, 0, 0));
        lbl_standding1.setText("0");
        jPanel2.add(lbl_standding1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 217, 150, -1));

        lbl_chew.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_chew.setForeground(new java.awt.Color(0, 0, 255));
        lbl_chew.setText("0");
        jPanel2.add(lbl_chew, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 96, 150, -1));

        lbl_begggs_robinson.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_begggs_robinson.setForeground(new java.awt.Color(204, 0, 153));
        lbl_begggs_robinson.setText("0");
        jPanel2.add(lbl_begggs_robinson, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 156, 150, -1));

        label13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label13.setName(""); // NOI18N
        label13.setText("Viscosidad del petroleo muerto");
        jPanel2.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 119, -1, -1));

        Metodo1_densidad3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad3.setForeground(new java.awt.Color(102, 102, 0));
        Metodo1_densidad3.setText("Correlacion de Vasquez-Beggs:");
        jPanel2.add(Metodo1_densidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 311, 180, -1));

        Metodo2_densidad4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo2_densidad4.setForeground(new java.awt.Color(204, 0, 153));
        Metodo2_densidad4.setText("Correlacion de Begggs:");
        jPanel2.add(Metodo2_densidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 219, 150, -1));

        Metodo1_densidad4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad4.setForeground(new java.awt.Color(0, 0, 153));
        Metodo1_densidad4.setText("Correlacion de Beal:");
        jPanel2.add(Metodo1_densidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 157, -1, -1));

        Metodo1_densidad5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad5.setForeground(new java.awt.Color(0, 153, 153));
        Metodo1_densidad5.setText("Correlacion de Beal:");
        jPanel2.add(Metodo1_densidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 186, -1, -1));

        Metodo1_densidad6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad6.setForeground(new java.awt.Color(102, 0, 102));
        Metodo1_densidad6.setText("Correlacion de Khan:");
        jPanel2.add(Metodo1_densidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 247, -1, -1));

        label14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label14.setText("Factor volumetrico del petroleo");
        jPanel2.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 417, -1, -1));

        Metodo3_densidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo3_densidad.setForeground(new java.awt.Color(0, 51, 51));
        Metodo3_densidad.setText("Correlacion de Vazquez-Beggs:");
        jPanel2.add(Metodo3_densidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 337, -1, -1));

        lbl_presion_burbuja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_presion_burbuja.setForeground(new java.awt.Color(0, 0, 0));
        lbl_presion_burbuja.setText("0");
        jPanel2.add(lbl_presion_burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 467, 181, -1));

        Metodo1_densidad9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Metodo1_densidad9.setForeground(new java.awt.Color(0, 0, 0));
        Metodo1_densidad9.setText("0");
        jPanel2.add(Metodo1_densidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 507, 181, -1));

        lbl_gravedad_especifica.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_gravedad_especifica.setForeground(new java.awt.Color(0, 0, 0));
        lbl_gravedad_especifica.setText("0");
        jPanel2.add(lbl_gravedad_especifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 537, 181, -1));

        factor_volumetrico.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        factor_volumetrico.setForeground(new java.awt.Color(0, 0, 0));
        factor_volumetrico.setText("0");
        jPanel2.add(factor_volumetrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 467, 181, -1));

        lbl_beal_muerto1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beal_muerto1.setForeground(new java.awt.Color(0, 0, 153));
        lbl_beal_muerto1.setText("0");
        jPanel2.add(lbl_beal_muerto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 187, 150, -1));

        lbl_begggs_muerto1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_begggs_muerto1.setForeground(new java.awt.Color(204, 0, 153));
        lbl_begggs_muerto1.setText("0");
        jPanel2.add(lbl_begggs_muerto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 277, 150, -1));

        lbl_glasso1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_glasso1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_glasso1.setText("0");
        jPanel2.add(lbl_glasso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 347, 150, -1));

        lbl_beal1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beal1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_beal1.setText("0");
        jPanel2.add(lbl_beal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 217, 150, -1));

        lbl_khan.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_khan.setForeground(new java.awt.Color(102, 0, 102));
        lbl_khan.setText("0");
        jPanel2.add(lbl_khan, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 277, 150, -1));

        lbl_chew1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_chew1.setForeground(new java.awt.Color(0, 0, 255));
        lbl_chew1.setText("0");
        jPanel2.add(lbl_chew1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 96, 150, -1));

        lbl_chew2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_chew2.setForeground(new java.awt.Color(0, 0, 255));
        lbl_chew2.setText("0");
        jPanel2.add(lbl_chew2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 96, 150, -1));

        lbl_begggs_robinson1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_begggs_robinson1.setForeground(new java.awt.Color(204, 0, 153));
        lbl_begggs_robinson1.setText("0");
        jPanel2.add(lbl_begggs_robinson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 156, 150, -1));

        lbl_begggs_robinson2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_begggs_robinson2.setForeground(new java.awt.Color(204, 0, 153));
        lbl_begggs_robinson2.setText("0");
        jPanel2.add(lbl_begggs_robinson2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 156, 150, -1));

        lbl_beal2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beal2.setForeground(new java.awt.Color(0, 153, 153));
        lbl_beal2.setText("0");
        jPanel2.add(lbl_beal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 217, 150, -1));

        lbl_beal3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beal3.setForeground(new java.awt.Color(0, 153, 153));
        lbl_beal3.setText("0");
        jPanel2.add(lbl_beal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 217, 150, -1));

        lbl_khan1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_khan1.setForeground(new java.awt.Color(102, 0, 102));
        lbl_khan1.setText("0");
        jPanel2.add(lbl_khan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 277, 150, -1));

        lbl_khan2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_khan2.setForeground(new java.awt.Color(102, 0, 102));
        lbl_khan2.setText("0");
        jPanel2.add(lbl_khan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 277, 150, -1));

        lbl_beggs1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beggs1.setForeground(new java.awt.Color(102, 102, 0));
        lbl_beggs1.setText("0");
        jPanel2.add(lbl_beggs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 358, 150, -1));

        lbl_beggs2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbl_beggs2.setForeground(new java.awt.Color(102, 102, 0));
        lbl_beggs2.setText("0");
        jPanel2.add(lbl_beggs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 358, 150, -1));

        label15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label15.setText("Densidad");
        jPanel2.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 139, -1, -1));

        lbl_API.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_API.setForeground(new java.awt.Color(0, 0, 0));
        lbl_API.setText("0");
        jPanel2.add(lbl_API, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 457, 181, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_verificarActionPerformed
        // TODO add your handling code here:
        intercambiar_datos(); //LLAMAMOS LA FUNCION PARA EJECUTARLO
        conversion_dato(); //LLAMAMOS LA FUNCION PARA EJECUTARLO
        operaciones();
    }//GEN-LAST:event_Jbtn_verificarActionPerformed
    public void operaciones()
    {
        if(presion_yacimiento < presion_burbuja)
        {
            saturado();
        }
        else if (presion_yacimiento > presion_burbuja)
        {
            Jlbl_tipo.setText("SUBSATURADO");
        }
    }
    public void saturado()
    {
        Jlbl_tipo.setText("SATURADO");
        Metodo3_densidad.setVisible(false);
        lbl_Vazquez_Beggs.setVisible(false);
        //GRAVEDAD ESPECIFICA
        gravedad_especifica = (densidad_petroleo/62.4);
        lbl_gravedad_especifica.setText(String.valueOf(gravedad_especifica));
        //DENSIDAD PETROLEO
        //ro=(densidad_petroleo/62.4);
        //Correlacion de Standding
        //poStanding=( ( (62.4*gravedad_especifica_petroleo)+(0.01362*relacion_gas_petroleo*gravedad_especifica_gas) ) / ( 0.972 + ( 0.000147 *( ( relacion_gas_petroleo*( Math.pow((gravedad_especifica_gas/gravedad_especifica_petroleo),0.5) ) ) + (1.25*temperatura) ) ));
        poStanding=( ((62.4*gravedad_especifica_petroleo) + (0.01362*relacion_gas_petroleo*gravedad_especifica_gas)) / ( 0.972 + ( 0.000147 *  (    Math.pow(  ( (relacion_gas_petroleo * (Math.pow((gravedad_especifica_gas/gravedad_especifica_petroleo), 0.5))) + (1.25*temperatura ) )  , 1.175)     )  ) )  );
        
        lbl_standding1.setText(String.valueOf(poStanding));
        //Correlacion de Ahmed  -- COMPROBADO
        poAhmed=((0.0763*relacion_gas_petroleo*gravedad_especifica_gas)+(350.376*gravedad_especifica_petroleo))/((0.0026537*relacion_gas_petroleo)+(2.4893*gravedad_especifica_petroleo)+3.491);
        lbl_Ahmed.setText(String.valueOf(poAhmed));
        //Gravedad API
        API= ((141.5/gravedad_especifica_petroleo)-131.5);
        lbl_API.setText(String.valueOf(API));
        //Viscosidad del petroleo muerto (uod) cp
        //Correlacion Beal
        aBeal=(Math.pow(10,(0.43+(8.33/gravedad_API))));
        uodBeal=( ( 0.32 + ( (18000000 /(Math.pow(gravedad_API,4.53))) ) ) * ((Math.pow( (360/(temperatura-260)),aBeal) )) );
        lbl_beal_muerto1.setText(String.valueOf(uodBeal));
        //Correlacion de Begggs 
        z=(3.0324-(0.02023*gravedad_API));
        vy=Math.pow(10, z);
        vx=vy*(Math.pow(temperatura,-1.163));        
        uodBegggs=((Math.pow(10, vx))-1);
        lbl_begggs_muerto1.setText(String.valueOf(uodBegggs));
        //Glasso
        aGlasso= ((10.313 * (Math.log10(temperatura)))-36.447);
        uodGlasso=(3.141 * (Math.pow(10, 10)) * (Math.pow(temperatura, -3.444)) * (Math.pow( (Math.log10(gravedad_API) ),aGlasso)) );
        lbl_glasso1.setText(String.valueOf(uodGlasso));
        //Viscosidad (cp)
        //Correlacion de Chew-Connaly
        eChew=(3.74*(Math.pow(10,-3)))*relacion_gas_petroleo;
        dChew=(1.1*(Math.pow(10,-3)))*relacion_gas_petroleo;
        cChew=(8.62*(Math.pow(10,-5)))*relacion_gas_petroleo;
        bChew=(0.68/(Math.pow(10,cChew)))+(0.25/(Math.pow(10,dChew)))+(0.062/(Math.pow(10,eChew)));
        aViscosidad=relacion_gas_petroleo*((2.2*(Math.pow(10,-7))*relacion_gas_petroleo)-(7.4*(Math.pow(10,-4))));
        uobViscosidadChew1=Math.pow(10,aViscosidad)*(Math.pow(uodBeal,bChew));
        uobViscosidadChew2=Math.pow(10,aViscosidad)*(Math.pow(uodBegggs,bChew));
        uobViscosidadChew3=Math.pow(10,aViscosidad)*(Math.pow(uodGlasso,bChew));
        lbl_chew.setText(String.valueOf(uobViscosidadChew1));
        lbl_chew1.setText(String.valueOf(uobViscosidadChew2));
        lbl_chew2.setText(String.valueOf(uobViscosidadChew3));
        //Correlacion de Begggs-Robinson
        bBegggs=5.44*(Math.pow((relacion_gas_petroleo+150),-0.338));
        aBegggs=10.715*(Math.pow((relacion_gas_petroleo+100),-0.515));
        uobViscosidadBegggs1=aBegggs*(Math.pow((uodBeal),bBegggs));
        uobViscosidadBegggs2=aBegggs*(Math.pow((uodBegggs),bBegggs));
        uobViscosidadBegggs3=aBegggs*(Math.pow((uodGlasso),bBegggs));
        lbl_begggs_robinson.setText(String.valueOf(uobViscosidadBegggs1));
        lbl_begggs_robinson1.setText(String.valueOf(uobViscosidadBegggs2));
        lbl_begggs_robinson2.setText(String.valueOf(uobViscosidadBegggs3));
        //Factor volumetrico del petroleo (Bo)
        
        Bo=0.972+(0.000147*(relacion_gas_petroleo*(Math.pow((gravedad_especifica_gas/(Math.pow(gravedad_especifica_petroleo,(1/2)))+1.125*temperatura),(1.175*temperatura)))));
        factor_volumetrico.setText(String.valueOf(Bo));
        //Compresibilidad 
        a1= 1.026638;
        a2= 0.00015530;
        a3= -0.0001847272;
        a4= 62400;
        a5= 13.6;
        //Co=((((((Rs*((yg/yo)^0.5))+(1.25*T))^1.175)*a2)+a1)/((a4*yo)+(a5*Rs*yg)))*EXP(a3*P)
        //Co=(((((Rs*(Math.pow((yg/yo)^0.5))+(1.25*temperatura))^1.175)*a2)+a1)/(((a4*yo)+(a5*Rs*yg))*EXP(a3*P))
        //Co=((((Math.pow(((relacion_gas_petroleo*(Math.pow((gravedad_especifica_gas/gravedad_especifica_petroleo),0.5))+(1.25*temperatura)),1.175)))*a2)+a1)/((a4*gravedad_especifica_petroleo)+(a5*relacion_gas_petroleo*gravedad_especifica_gas)))*(Math.exp((a3*presion_yacimiento)));
        
        Co =(  ( ( a1 + ( a2*( Math.pow( (relacion_gas_petroleo*(Math.pow((gravedad_especifica_gas/gravedad_especifica_petroleo), 0.5))) + (1.25*temperatura), 1.175) ) ) ) / ( (a4*gravedad_especifica_petroleo) + (a5*relacion_gas_petroleo*gravedad_especifica_gas) ) ) * (Math.exp((a3*presion_yacimiento))) );
        compresibilidad.setText(String.valueOf(Co));
        
        //Presion de burbuja pb (psi)
        
        //Pb=( 18.2*((((Math.pow(10,(0.00091*temperatura)) )/((Math.pow(10,(0.0125*API))))-1.4)*(Math.pow((relacion_gas_petroleo/gravedad_especifica_gas),0.83)));
        Pb= ( 18.2 * ( ( (Math.pow((relacion_gas_petroleo/gravedad_especifica_gas),0.83)) * ( (Math.pow(10, (0.00091*temperatura)))/((Math.pow(10, API))) ) ) - 1.4  ) );
        lbl_presion_burbuja.setText(String.valueOf(Pb));
    }
    public void intercambiar_datos() //FUNCION
    {
        //INTERCAMBIA EL DATOS DEL JTEXTBOX A UNA VARIABLE TIPO STRING
        TXT_presion_yacimiento = Jtxt_presion_yacimiento.getText();
        TXT_presion_burbuja = Jtxt_presion_burbuja.getText();
        TXT_densidad_petroleo = Jtxt_densidad_petroleo.getText();
        TXT_gravedad_especifica_petroleo = Jtxt_Gravedad_especifica_petroleo.getText();
        TXT_gravedad_especifica_gas = Jtxt_Gravedad_especifica_gas.getText();
        TXT_relacion_gas_petroleo = Jtxt_Relacion_gas_petroleo.getText();
        TXT_temperatura = Jtxt_Temperatura.getText();
        TXT_gravedad_API = Jtxt_Gravedad_API.getText();
        TXT_viscosidad_cp = Jtxt_Viscosidad_cp.getText();
    }
    public void conversion_dato() //FUNCION
    {
        //CONVIERTE LA VARIABLE TIPO STRING A DOUBLE PARA PODER REALIZAR LAS OPERACIONES MATEMATICAS BASICAS
        presion_yacimiento = Double.parseDouble(TXT_presion_yacimiento);
        presion_burbuja = Double.parseDouble(TXT_presion_burbuja);
        densidad_petroleo = Double.parseDouble(TXT_densidad_petroleo);
        gravedad_especifica_petroleo = Double.parseDouble(TXT_gravedad_especifica_petroleo);
        gravedad_especifica_gas = Double.parseDouble(TXT_gravedad_especifica_gas);
        relacion_gas_petroleo = Double.parseDouble(TXT_relacion_gas_petroleo);
        temperatura= Double.parseDouble(TXT_temperatura);
        gravedad_API = Double.parseDouble(TXT_gravedad_API);
        viscosidad_cp = Double.parseDouble(TXT_viscosidad_cp);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_verificar;
    private javax.swing.JLabel Jlbl_tipo;
    private javax.swing.JTextPane Jtxt_Gravedad_API;
    private javax.swing.JTextPane Jtxt_Gravedad_especifica_gas;
    private javax.swing.JTextPane Jtxt_Gravedad_especifica_petroleo;
    private javax.swing.JTextPane Jtxt_Relacion_gas_petroleo;
    private javax.swing.JTextPane Jtxt_Temperatura;
    private javax.swing.JTextPane Jtxt_Viscosidad_cp;
    private javax.swing.JTextPane Jtxt_densidad_petroleo;
    private javax.swing.JTextPane Jtxt_presion_burbuja;
    private javax.swing.JTextPane Jtxt_presion_yacimiento;
    private java.awt.Label Metodo1_densidad1;
    private java.awt.Label Metodo1_densidad2;
    private java.awt.Label Metodo1_densidad3;
    private java.awt.Label Metodo1_densidad4;
    private java.awt.Label Metodo1_densidad5;
    private java.awt.Label Metodo1_densidad6;
    private java.awt.Label Metodo1_densidad9;
    private java.awt.Label Metodo2_densidad1;
    private java.awt.Label Metodo2_densidad2;
    private java.awt.Label Metodo2_densidad3;
    private java.awt.Label Metodo2_densidad4;
    private java.awt.Label Metodo3_densidad;
    private java.awt.Label compresibilidad;
    private java.awt.Label factor_volumetrico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Label lbl_API;
    private java.awt.Label lbl_Ahmed;
    private java.awt.Label lbl_Vazquez_Beggs;
    private java.awt.Label lbl_beal1;
    private java.awt.Label lbl_beal2;
    private java.awt.Label lbl_beal3;
    private java.awt.Label lbl_beal_muerto1;
    private java.awt.Label lbl_begggs_muerto1;
    private java.awt.Label lbl_begggs_robinson;
    private java.awt.Label lbl_begggs_robinson1;
    private java.awt.Label lbl_begggs_robinson2;
    private java.awt.Label lbl_beggs;
    private java.awt.Label lbl_beggs1;
    private java.awt.Label lbl_beggs2;
    private java.awt.Label lbl_chew;
    private java.awt.Label lbl_chew1;
    private java.awt.Label lbl_chew2;
    private java.awt.Label lbl_glasso1;
    private java.awt.Label lbl_gravedad_especifica;
    private java.awt.Label lbl_khan;
    private java.awt.Label lbl_khan1;
    private java.awt.Label lbl_khan2;
    private java.awt.Label lbl_presion_burbuja;
    private java.awt.Label lbl_standding1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
