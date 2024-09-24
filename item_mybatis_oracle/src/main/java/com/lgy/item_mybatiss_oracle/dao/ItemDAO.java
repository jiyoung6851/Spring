package com.lgy.item_mybatiss_oracle.dao;

import java.util.ArrayList;

import com.lgy.item_mybatiss_oracle.dto.ItemDTO;

public interface ItemDAO {
	public void write(String name, int price, String description);
	public ArrayList<ItemDTO> list();
}