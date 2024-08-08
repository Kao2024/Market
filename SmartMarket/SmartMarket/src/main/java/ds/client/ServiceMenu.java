package ds.client;

/**
 *
 * @author HP
 */
import generated.ds.service1.LightRequest;
import generated.ds.service1.LightResponse;

import generated.ds.service1.Service1Grpc;
import generated.ds.service2.ResponseMessage;
import generated.ds.service2.Service2Grpc;
import generated.ds.service3.Service3Grpc;
import generated.ds.service4.Service4Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ServiceMenu() {
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

        Menu = new javax.swing.JPanel();
        lightLbl = new javax.swing.JLabel();
        lightInputTf = new javax.swing.JTextField();
        TurnOnBtn = new javax.swing.JButton();
        TurnOffBtn = new javax.swing.JButton();
        lightOutputSp = new javax.swing.JScrollPane();
        lightOutputTa = new javax.swing.JTextArea();
        InventoryLbl = new javax.swing.JLabel();
        PNStockTf = new javax.swing.JTextField();
        StockBtn = new javax.swing.JButton();
        AllStockBtn = new javax.swing.JButton();
        StockOutputSp = new javax.swing.JScrollPane();
        StockOutputTa = new javax.swing.JTextArea();
        PriceLbl = new javax.swing.JLabel();
        PNPriceTf = new javax.swing.JTextField();
        StandardBtn = new javax.swing.JButton();
        PNOutputTf = new javax.swing.JTextField();
        CutomizeLbl = new javax.swing.JLabel();
        PNLbl = new javax.swing.JLabel();
        PNinputTf = new javax.swing.JTextField();
        CNLbl = new javax.swing.JLabel();
        CNinputTf = new javax.swing.JTextField();
        DeliveryLbl = new javax.swing.JLabel();
        DeliveryInputTf = new javax.swing.JTextField();
        EnquiryBtn = new javax.swing.JButton();
        EnquiryOutputSp = new javax.swing.JScrollPane();
        EnquiryTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        lightLbl.setText("Enter the light number");

        lightInputTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightInputTfActionPerformed(evt);
            }
        });

        TurnOnBtn.setText("Turn On");
        TurnOnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnOnBtnActionPerformed(evt);
            }
        });

        TurnOffBtn.setText("Turn Off");
        TurnOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnOffBtnActionPerformed(evt);
            }
        });

        lightOutputTa.setColumns(20);
        lightOutputTa.setRows(5);
        lightOutputSp.setViewportView(lightOutputTa);

        InventoryLbl.setText("Enter the product number for inventory check");

        PNStockTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNStockTfActionPerformed(evt);
            }
        });

        StockBtn.setText("Check Stock");
        StockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockBtnActionPerformed(evt);
            }
        });

        AllStockBtn.setText("All Stock");
        AllStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStockBtnActionPerformed(evt);
            }
        });

        StockOutputTa.setColumns(20);
        StockOutputTa.setRows(5);
        StockOutputSp.setViewportView(StockOutputTa);

        PriceLbl.setText("Enter the product number for standard price check");

        PNPriceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNPriceTfActionPerformed(evt);
            }
        });

        StandardBtn.setText("Price");
        StandardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandardBtnActionPerformed(evt);
            }
        });

        PNOutputTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNOutputTfActionPerformed(evt);
            }
        });

        CutomizeLbl.setText("Customize order");

        PNLbl.setText("Product Name");

        PNinputTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNinputTfActionPerformed(evt);
            }
        });

        CNLbl.setText("Coupon Number");

        CNinputTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNinputTfActionPerformed(evt);
            }
        });

        DeliveryLbl.setText("Delvery Method");

        EnquiryBtn.setText("Enquire Price");
        EnquiryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnquiryBtnActionPerformed(evt);
            }
        });

        EnquiryTa.setColumns(20);
        EnquiryTa.setRows(5);
        EnquiryOutputSp.setViewportView(EnquiryTa);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PNLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DeliveryLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeliveryInputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PNPriceTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StandardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                .addComponent(PNStockTf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AllStockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StockBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PriceLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CutomizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lightInputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TurnOnBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TurnOffBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PNinputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(CNLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CNinputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnquiryBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lightOutputSp)
                    .addComponent(StockOutputSp, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(EnquiryOutputSp)
                    .addComponent(PNOutputTf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(TurnOnBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TurnOffBtn)
                                .addGap(11, 11, 11))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(lightLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lightInputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(InventoryLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(StockBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AllStockBtn))
                            .addComponent(PNStockTf, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lightOutputSp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StockOutputSp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PriceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PNPriceTf)
                    .addComponent(StandardBtn)
                    .addComponent(PNOutputTf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CutomizeLbl)
                .addGap(7, 7, 7)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PNinputTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PNLbl))
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(EnquiryBtn))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CNLbl)
                                    .addComponent(CNinputTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DeliveryInputTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeliveryLbl)))))
                    .addComponent(EnquiryOutputSp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CNinputTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNinputTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNinputTfActionPerformed

    private void PNinputTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNinputTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PNinputTfActionPerformed

    private void PNOutputTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNOutputTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNOutputTfActionPerformed

    private void StandardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandardBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("service 3 to be invoked ...");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

        //preparing message to send
        generated.ds.service3.RequestMessage request = generated.ds.service3.RequestMessage.newBuilder().setProductNumber(PNPriceTf.getText()).build();

        //retreving reply from service
        String productNumber = PNinputTf.getText();
        generated.ds.service3.ResponseMessage response =  blockingStub.service3Do(request);
        PNPriceTf.setText(response.getProductNumber() + " : " + response.getPrice());
        channel.shutdown();
    }//GEN-LAST:event_StandardBtnActionPerformed

    private void PNPriceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNPriceTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PNPriceTfActionPerformed

    private void AllStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStockBtnActionPerformed
        // TODO add your handling code here:
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        Service2Grpc.Service2BlockingStub stub = Service2Grpc.newBlockingStub(channel);
        
        ResponseMessage request = ResponseMessage.newBuilder().setProductNumber("").build();
        //ResponseMessage response = stub.getAllStock(request);
        //StockOutputTa.setText("All stock:\n" + response.getStockList());
    }//GEN-LAST:event_AllStockBtnActionPerformed

    private void StockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockBtnActionPerformed
        // TODO add your handling code here:
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);
        
        //preparing message to send
        String productNumber = PNinputTf.getText();
        generated.ds.service2.RequestMessage request = generated.ds.service2.RequestMessage.newBuilder().setProductNumber(productNumber).build();

        //retrieving reply from service
        generated.ds.service2.ResponseMessage response =  blockingStub.service2Do(request);
        StockOutputTa.setText(response.getProductNumber() + " : " + response.getStock());
        channel.shutdown();

    }//GEN-LAST:event_StockBtnActionPerformed

    private void PNStockTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNStockTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PNStockTfActionPerformed

    private void TurnOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnOffBtnActionPerformed
        // TODO add your handling code here:
        

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        Service1Grpc.Service1Stub asyncStub = Service1Grpc.newStub(channel);

        //preparing message to send
        //retrieving reply from service
        StreamObserver<LightRequest> requestObserver = asyncStub.turnOff(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse response) {
                lightOutputTa.setText(response.getLightNumber() + " : " + (response.getStatus() ? "On" : "Off"));
            }
            @Override
            public void onError(Throwable t) {
                System.err.println("Error in TurnOff: " + t);
            }
            @Override
            public void onCompleted() {
                channel.shutdown();
            }
        });
        String lightNumber = lightInputTf.getText();
        LightRequest request = LightRequest.newBuilder().setLightNumber(lightNumber).build();
        requestObserver.onNext(request);
        requestObserver.onCompleted();
    }//GEN-LAST:event_TurnOffBtnActionPerformed

    private void TurnOnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnOnBtnActionPerformed
        // TODO add your handling code here:
        
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        Service1Grpc.Service1Stub asyncStub = Service1Grpc.newStub(channel);

        //preparing message to send
        //retrieving reply from service
        StreamObserver<LightRequest> requestObserver = asyncStub.turnOn(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse response) {
                lightOutputTa.setText(response.getLightNumber() + " : " + (response.getStatus() ? "On" : "Off"));
            }
            @Override
            public void onError(Throwable t) {
                System.err.println("Error in TurnOn: " + t);
            }

            @Override
            public void onCompleted() {
                channel.shutdown();
            }
        });
        String lightNumber = lightInputTf.getText();
        LightRequest request = LightRequest.newBuilder().setLightNumber(lightNumber).build();
        requestObserver.onNext(request);
        requestObserver.onCompleted();
    }//GEN-LAST:event_TurnOnBtnActionPerformed

    private void lightInputTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightInputTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lightInputTfActionPerformed

    private void EnquiryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnquiryBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EnquiryBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllStockBtn;
    private javax.swing.JLabel CNLbl;
    private javax.swing.JTextField CNinputTf;
    private javax.swing.JLabel CutomizeLbl;
    private javax.swing.JTextField DeliveryInputTf;
    private javax.swing.JLabel DeliveryLbl;
    private javax.swing.JButton EnquiryBtn;
    private javax.swing.JScrollPane EnquiryOutputSp;
    private javax.swing.JTextArea EnquiryTa;
    private javax.swing.JLabel InventoryLbl;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel PNLbl;
    private javax.swing.JTextField PNOutputTf;
    private javax.swing.JTextField PNPriceTf;
    private javax.swing.JTextField PNStockTf;
    private javax.swing.JTextField PNinputTf;
    private javax.swing.JLabel PriceLbl;
    private javax.swing.JButton StandardBtn;
    private javax.swing.JButton StockBtn;
    private javax.swing.JScrollPane StockOutputSp;
    private javax.swing.JTextArea StockOutputTa;
    private javax.swing.JButton TurnOffBtn;
    private javax.swing.JButton TurnOnBtn;
    private javax.swing.JTextField lightInputTf;
    private javax.swing.JLabel lightLbl;
    private javax.swing.JScrollPane lightOutputSp;
    private javax.swing.JTextArea lightOutputTa;
    // End of variables declaration//GEN-END:variables
}
