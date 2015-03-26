/*
 *  FinacResources.java
 *  
 *  @author channa mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Jun 20, 2014, 11:50:55 AM
 *  Copyrights Channa Mohan, All rights reserved.
 *  
 */
package com.pos.resources;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author mohan
 */
public class Resources {

    public static URL getImageIconURL(String path) {
        return Resources.class.getResource(path);
    }

    public static ImageIcon getImageIcon(String path) {
        ImageIcon icon;
        try {
            icon = new ImageIcon(Resources.class.getResource(path));
        } catch (Exception e) {
            icon = null;
        }

        return icon;
    }

    public static ImageIcon getImageIcon(String path, int height, int width) {
        ImageIcon icon;
        try {
            icon = new ImageIcon(new ImageIcon(Resources.class.getResource(path)).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        } catch (Exception e) {
            icon = null;
        }

        return icon;
    }
    public static final String DISCOUNT = "/com/pos/resources/icons/system/discount.png";
    public static final String VAL_DIS = "/com/pos/resources/icons/system/ValDis.png";
    public static final String SALES_RET = "/com/pos/resources/icons/system/SalesRet.png";
    public static final String ITEM_DISCOUNT_PERSENTAGE = "/com/pos/resources/icons/system/ItemDiscountPresent.png";
    public static final String ITEM_DISCOUNT = "/com/pos/resources/icons/system/ItemDiscount.png";
    public static final String OPERATOR = "/com/pos/resources/icons/system/Operator.png";
    public static final String SUSPEND = "/com/pos/resources/icons/system/Suspend.png";
    public static final String RECALL = "/com/pos/resources/icons/system/Suspend.png";
    public static final String ITEM_RE_ENTER = "/com/pos/resources/icons/system/ItemReEnter.png";
    public static final String BILL_CANCEL = "/com/pos/resources/icons/system/BillCancel.png";
    public static final String CANCEL_ITEM = "/com/pos/resources/icons/system/CancelItem.png";
    public static final String ERROR_CORRECTION = "/com/pos/resources/icons/system/ErrorCorrections.png";
    public static final String CUSTOMER_PAYMENT = "/com/pos/resources/icons/system/customer_payment.png";
    public static final String FULL_CANCEL = "/com/pos/resources/icons/system/FullCancel.png";
    public static final String PAID_OUT = "/com/pos/resources/icons/system/paidout.png";
    public static final String CASH = "/com/pos/resources/icons/system/cash.png";
    public static final String ENTER_KEY = "/com/pos/resources/icons/system/EnterKey.png";
    public static final String DROWER_OPEN = "/com/pos/resources/icons/system/Drawer.png";
}
