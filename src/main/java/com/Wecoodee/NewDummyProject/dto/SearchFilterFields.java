package com.Wecoodee.NewDummyProject.dto;

public class SearchFilterFields<T> {

	private T filterFieldValues;

	private int pageNumber;

	private int pageSize;

	public T getFilterFieldValues() {
		return filterFieldValues;
	}

	public void setFilterFieldValues(T filterFieldValues) {
		this.filterFieldValues = filterFieldValues;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "SearchFilterFields [filterFieldValues=" + filterFieldValues + ", pageNumber=" + pageNumber
				+ ", pageSize=" + pageSize + "]";
	}

}
