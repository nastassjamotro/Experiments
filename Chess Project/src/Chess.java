public class Chess {
  private Board board = new Board();
  private Player white;
  private Player black;
  public Chess() {
    super();
  }
  
  public void setColorWhite(Player player) {
    this.white = player;
  }
  
  public void setColorBlack(Player player) {
    this.black = player;
  }
  
  public Board getBoard() {
    return board;
  }
  
  publid void setBaord(Board board) {
    this.board = board;
  }
  
  public Player getWhite() {
    return whtie;
  }
  
  public void setWhite(Player white) {
    this.white = white;
  }
  
  public Player getBlack() {
    return black;
  }
  
  public void setBlack(Player black) {
    this.black = black;
  }
  
  public boolean initializeBoardGivenPlayer() {
    if(this.black == null || this.white == null)
      return false;
    this.board = new Board();
    for(int i=0; i<black.getPieces().size(); i++) {
      board.getSpot(black.getPieces().get(i).getX(), black.getPieces().get(i).getY()).occupySpot(black.getPieces().get(i));
    }
    return true;
  }
  
}
