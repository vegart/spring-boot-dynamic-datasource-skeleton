package com.ppcwiz.admin.core.component;

import org.apache.poi.ss.usermodel.*;

import org.springframework.stereotype.Component;

import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.util.List;

import java.util.Map;

@Component("statXls")

public class StatXlsView extends AbstractXlsView {

    @Override

    protected void buildExcelDocument(

        Map<String, Object> model, Workbook workbook,

        HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setHeader("Content-Disposition", "attachment; filename=\"stat.xls\"");

        String type = (String) model.get("type");
        
        if("profile".equals(type)) {
        	// profile
        	Map prof_data = (Map) model.get("prof_data");
        	createSheet(workbook, prof_data);
        	// campaign
        	Map camp_data = (Map) model.get("camp_data");
        	createSheet(workbook, camp_data);
        	// adgroup
        	Map ad_group_data = (Map) model.get("ad_group_data");
        	createSheet(workbook, ad_group_data);
        	// keyword
        	Map keyword_data = (Map) model.get("keyword_data");
        	createSheet(workbook, keyword_data);
        	// searchterm
        	Map searchterm_data = (Map) model.get("searchterm_data");
        	createSheet(workbook, searchterm_data);
        	// product_ad
        	Map product_ad_data = (Map) model.get("product_ad_data");
        	createSheet(workbook, product_ad_data);
        }else if("campaign".equals(type)) {
        	// campaign
        	Map camp_data = (Map) model.get("camp_data");
        	createSheet(workbook, camp_data);
        }else {
        	Map ad_group_data = (Map) model.get("ad_group_data");
        	createSheet(workbook, ad_group_data);
        	try {
	        	Map product_targeting_data = (Map) model.get("product_targeting_data");
	        	createSheet(workbook, product_targeting_data);
        	}catch(Exception e) {
        		try {
	        		Map keyword_data = (Map) model.get("keyword_data");
		        	createSheet(workbook, keyword_data);
        		}catch(Exception ex) {
        		}
        	}
        }
    }
    
    private void createSheet(Workbook workbook, Map data) {
    	
    	String sheetname = (String)data.get("title");
    	
    	List<String> headList = (List<String>)data.get("head_list");
    	List<List<String>> bodyList = (List<List<String>>)data.get("body_list");
    	List<CellType> cell_type_list = (List<CellType>)data.get("cell_type_list");
    	
    	CellStyle numberCellStyle = workbook.createCellStyle();
    	DataFormat numberDataFormat = workbook.createDataFormat();
        numberCellStyle.setDataFormat(numberDataFormat.getFormat("0.00"));
    
    	Sheet sheet = workbook.createSheet(sheetname);
    	createHead(sheet, headList);
    	createBody(sheet, bodyList, cell_type_list, numberCellStyle);
    }
    
    private void createHead(Sheet sheet, List<String> headList) {
		createRow(sheet, headList, 0, null, null);
	}

	private void createBody(Sheet sheet, List<List<String>> bodyList, List<CellType> type_list, CellStyle style) {
		int rowSize = bodyList.size();
		for (int i = 0; i < rowSize; i++) {
			createRow(sheet, bodyList.get(i), i + 1, type_list, style);
		}
	}

	private void createRow(Sheet sheet, List<String> cellList, int rowNum, List<CellType> type_list, CellStyle style) {
		int size = cellList.size();
		Row row = sheet.createRow(rowNum);
		

		for (int i = 0; i < size; i++) {
			Cell cell = row.createCell(i);
			if(type_list!=null) {
				if(type_list.get(i)==CellType.NUMERIC) {
					cell.setCellType(type_list.get(i));
					cell.setCellValue(Double.parseDouble(cellList.get(i)));
					cell.setCellStyle(style);
				}else {
					cell.setCellValue(cellList.get(i));
				}
			}else {
				cell.setCellValue(cellList.get(i));
			}
		}
	}

}