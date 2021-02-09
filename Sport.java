package pet;

public class Sport {

	private static int size;
	private String favoritePLayerName;
	private int favoriteNumber;
	private String favoriteTeam;


	public void sport() {
	}
	
	
	public void sport(String initName, int initJerseyNumber) {
	
	initName = favoritePLayerName;
	initJerseyNumber = favoriteNumber;
}
	
	public void sport(String initName,  int initJerseyNumber, String initTeam) {
		
		initName = favoritePLayerName;
		initJerseyNumber = favoriteNumber;
		initTeam = favoriteTeam;
	}


	public String getFavoritePLayerName() {
		return favoritePLayerName;
	}


	public void setFavoritePLayerName(String favoritePLayerName) {
		this.favoritePLayerName = favoritePLayerName;
	}


	public int getFavoriteNumber() {
		return favoriteNumber;
	}

	public void setFavoriteNumber(int favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}


	public String getFavoriteTeam() {
		return favoriteTeam;
	}


	public void setFavoriteTeam(String favoriteTeam) {
		this.favoriteTeam = favoriteTeam;
	}


		public static void main(String[]args) {
			
	
		}
 
		@Override
		public String toString() {
			return "Sport [getFavoritePLayerName()=" + getFavoritePLayerName() + ", getFavoriteNumber()="
					+ getFavoriteNumber() + ", getFavoriteTeam()=" + getFavoriteTeam() + "]";
		}

//		public boolean isEmpty() {
//		    if (Sport.size == 0) {
//		        return true;
//		    } else {
//		        return false;
//		    }


}