/*
 *  CartSelectListener.java
 *  
 *  @author Channa Mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Mar 24, 2015, 4:17:39 PM
 *  Copyrights channa mohan, All rights reserved.
 *  
 */
package com.pos.pos_transaction.cart_table;

import com.pos.pos_transaction.item_list.object.MItem;

/**
 *
 * @author mohan
 */
public abstract class CartSelectListener {
    public abstract void cartSelectionChanged(MItem newSelectionItem);
}
