package hello.storage;

public class StorageBean {
	private final String fileName;
    private final String contentType;
    private final String fileDesc;
    private final long size;
    
    public StorageBean(String fileName, String contentType,String fileDesc,long size ){
    	this.fileName = fileName;
    	this.contentType = contentType;
    	this.fileDesc = fileDesc;
    	this.size = size;
    }

	public String getFileName() {
		return fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public String getFileDesc() {
		return fileDesc;
	}

	public long getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "File Meta-Data [fileName=" + fileName + ", contentType=" + contentType + ", fileDesc=" + fileDesc
				+ ", size=" + size + "]";
	}
    
}
