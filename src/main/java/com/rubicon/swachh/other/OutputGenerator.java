package com.rubicon.swachh.other;

import com.rubicon.swachh.models.ReportData;

import java.util.*;

public class OutputGenerator {
    private int PADDING_SIZE = 4;
    private String NEW_LINE = "\n";
    private String TABLE_JOINT_SYMBOL = "+";
    private String TABLE_V_SPLIT_SYMBOL = "|";
    private String TABLE_H_SPLIT_SYMBOL = "-";
    public OutputGenerator(){

    }
    public void createHeader(String headerName){
        System.out.println(
                "_____________________________________________________________________________________________");//90
        System.out.format("%1s %92s","|","|");
        System.out.print("\n");
        System.out.format("%1s %54s %37s","|",headerName,"|");
        System.out.print("\n");
        System.out.format("%1s %92s","|","|");
        System.out.print("\n" +
                "|--------------------------------------------------------------------------------------------|\n");
    }

    public void createFooter(){
        System.out.format("%1s %92s","|","|");
        System.out.print("\n" +
                "|____________________________________________________________________________________________|\n");
    }

    private void printTheSpaceFormat(String string) {
        System.out.print(string);
        int length= string.length();
        for (int i=0;i<93-length;i++)
            System.out.print(" ");
        System.out.println("|");
    }

    public void printTheReport(ReportData reportData) {
        String userName = "| Recycled By:"+reportData.getUserData().getName();
        String userEmail = "| User Email: "+reportData.getUserData().getEmail();
        String userPhone = "| User Phone: "+reportData.getUserData().getNumber();
        String totalItems = "| Total Waste Items: "+reportData.getArrayWasteData().size();
        String detailedInformation = "| Detailed Information About Waste: ";
        String totalWeightAndPoints = "| Total Weight: "+reportData.getTotalWeight()+ "     Total" +
                " Coupon Points: "+ reportData.getTotalCouponPoints();
        String couponCode = "| The coupon code is: "+reportData.getCouponData().getCouponCode();

        String thankYouNote = "| Thank you, for contributing towards a Swachh Bharat";


        printTheSpaceFormat(userName);
        printTheSpaceFormat(userEmail);
        printTheSpaceFormat(userPhone);
        printTheSpaceFormat(totalItems);
        printTheSpaceFormat(detailedInformation);

        List<String> headersList = new ArrayList<>();
        headersList.add("S.No");
        headersList.add("Type of Wastage");
        headersList.add("Brand of Wastage");
        headersList.add("Weight");
        headersList.add("Points");

        List<List<String>> rowsList = new ArrayList<>();

        if (reportData.getArrayWasteData().size()>1){
            for (int i = 0; i < reportData.getArrayWasteData().size(); i++) {
                List<String> row = new ArrayList<>();
                row.add(String.valueOf(Integer.parseInt(String.valueOf(i))+1));
                row.add(reportData.getArrayWasteData().get(i).getWasteTypeData().getTypeOfWaste());
                row.add(reportData.getArrayWasteData().get(i).getWasteBrandData().getTypeOfWasteBrand());
                row.add(String.valueOf(reportData.getArrayWasteData().get(i).getWeight()));
                row.add(String.valueOf(reportData.getArrayWasteData().get(i).getPoints()));
                rowsList.add(row);
            }

        }
        if (reportData.getArrayWasteData().size()==1){

            List<String> row = new ArrayList<>();
            row.add(String.valueOf(1));
            row.add(reportData.getArrayWasteData().get(0).getWasteTypeData().getTypeOfWaste());
            row.add(reportData.getArrayWasteData().get(0).getWasteBrandData().getTypeOfWasteBrand());
            row.add(String.valueOf(reportData.getArrayWasteData().get(0).getWeight()));
            row.add(String.valueOf(reportData.getArrayWasteData().get(0).getPoints()));
            rowsList.add(row);
        }


        System.out.print(generateTable(headersList,rowsList));
        printTheSpaceFormat(totalWeightAndPoints);
        printTheSpaceFormat(couponCode);
        printTheSpaceFormat(thankYouNote);
    }



    public String generateTable(List<String> headersList, List<List<String>> rowsList, int... overRiddenHeaderHeight)
    {
        StringBuilder stringBuilder = new StringBuilder();

        int rowHeight = overRiddenHeaderHeight.length > 0 ? overRiddenHeaderHeight[0] : 1;

        Map<Integer,Integer> columnMaxWidthMapping = getMaximumWidthofTable(headersList, rowsList);


        createRowLine(stringBuilder, headersList.size(), columnMaxWidthMapping);
        stringBuilder.append(NEW_LINE);


        for (int headerIndex = 0; headerIndex < headersList.size(); headerIndex++) {
            fillCell(stringBuilder, headersList.get(headerIndex), headerIndex, columnMaxWidthMapping);
        }

        stringBuilder.append(NEW_LINE);

        createRowLine(stringBuilder, headersList.size(), columnMaxWidthMapping);


        for (List<String> row : rowsList) {

            for (int i = 0; i < rowHeight; i++) {
                stringBuilder.append(NEW_LINE);
            }

            for (int cellIndex = 0; cellIndex < row.size(); cellIndex++) {
                fillCell(stringBuilder, row.get(cellIndex), cellIndex, columnMaxWidthMapping);
            }

        }

        stringBuilder.append(NEW_LINE);
        createRowLine(stringBuilder, headersList.size(), columnMaxWidthMapping);
        stringBuilder.append(NEW_LINE);

        return stringBuilder.toString();
    }

    private void fillSpace(StringBuilder stringBuilder, int length)
    {
        for (int i = 0; i < length; i++) {
            stringBuilder.append(" ");
        }
    }

    private void createRowLine(StringBuilder stringBuilder,int headersListSize, Map<Integer,Integer> columnMaxWidthMapping)
    {
        for (int i = 0; i < headersListSize; i++) {
            if(i == 0)
            {
                stringBuilder.append(TABLE_JOINT_SYMBOL);
            }

            for (int j = 0; j < columnMaxWidthMapping.get(i) + PADDING_SIZE * 2 ; j++) {
                stringBuilder.append(TABLE_H_SPLIT_SYMBOL);
            }
            stringBuilder.append(TABLE_JOINT_SYMBOL);
        }
    }


    private Map<Integer,Integer> getMaximumWidthofTable(List<String> headersList, List<List<String>> rowsList)
    {
        Map<Integer,Integer> columnMaxWidthMapping = new HashMap<>();

        for (int columnIndex = 0; columnIndex < headersList.size(); columnIndex++) {
            columnMaxWidthMapping.put(columnIndex, 0);
        }

        for (int columnIndex = 0; columnIndex < headersList.size(); columnIndex++) {

            if(headersList.get(columnIndex).length() > columnMaxWidthMapping.get(columnIndex))
            {
                columnMaxWidthMapping.put(columnIndex, headersList.get(columnIndex).length());
            }
        }


        for (List<String> row : rowsList) {

            for (int columnIndex = 0; columnIndex < row.size(); columnIndex++) {

                if(row.get(columnIndex).length() > columnMaxWidthMapping.get(columnIndex))
                {
                    columnMaxWidthMapping.put(columnIndex, row.get(columnIndex).length());
                }
            }
        }

        for (int columnIndex = 0; columnIndex < headersList.size(); columnIndex++) {

            if(columnMaxWidthMapping.get(columnIndex) % 2 != 0)
            {
                columnMaxWidthMapping.put(columnIndex, columnMaxWidthMapping.get(columnIndex) + 1);
            }
        }


        return columnMaxWidthMapping;
    }

    private int getOptimumCellPadding(int cellIndex,int datalength,Map<Integer,Integer> columnMaxWidthMapping,int cellPaddingSize)
    {
        if(datalength % 2 != 0)
        {
            datalength++;
        }

        if(datalength < columnMaxWidthMapping.get(cellIndex))
        {
            cellPaddingSize = cellPaddingSize + (columnMaxWidthMapping.get(cellIndex) - datalength) / 2;
        }

        return cellPaddingSize;
    }

    private void fillCell(StringBuilder stringBuilder,String cell,int cellIndex,Map<Integer,Integer> columnMaxWidthMapping)
    {

        int cellPaddingSize = getOptimumCellPadding(cellIndex, cell.length(), columnMaxWidthMapping, PADDING_SIZE);

        if(cellIndex == 0)
        {
            stringBuilder.append(TABLE_V_SPLIT_SYMBOL);
        }

        fillSpace(stringBuilder, cellPaddingSize);
        stringBuilder.append(cell);
        if(cell.length() % 2 != 0)
        {
            stringBuilder.append(" ");
        }

        fillSpace(stringBuilder, cellPaddingSize);

        stringBuilder.append(TABLE_V_SPLIT_SYMBOL);

    }


}
