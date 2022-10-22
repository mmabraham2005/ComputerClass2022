public class Theater

{

private Seat[][] theaterSeats;

/** Constructs a Theater object, as described in part (a).

* Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0

*/

public Theater(int seatsPerRow, int tier1Rows, int tier2Rows)

{  theaterSeats= new Seat[seatsPerRow][tier1Rows+tier2Rows];
}

/** Returns true if a seat holder was reassigned from the seat at fromRow, fromCol

* to the seat at toRow, toCol; otherwise it returns false, as described in part (b).

* Precondition: fromRow, fromCol, toRow, and toCol represent valid row and

* column positions in the theater.

* The seat at fromRow, fromCol is not available.

*/

public boolean reassignSeat(int fromRow, int fromCol,

int toRow, int toCol)

{  
if(theaterSeats[toRow][toCol].isAvailable()) {

int tierDestination =theaterSeats[toRow][toCol].getTier();

int tierSource =theaterSeats[fromRow][fromCol].getTier();

if(tierDestination<=tierSource) {

if(tierDestination==tierSource) {

if(fromRow<toRow) {

return false;

}else {

theaterSeats[toRow][toCol].setAvailability(false);

theaterSeats[fromRow][fromCol].setAvailability(true);

return true;

}

}

theaterSeats[toRow][toCol].setAvailability(false);

theaterSeats[fromRow][fromCol].setAvailability(true);

return true;

}else {

return false;

}

}else {

return false;

}

}

}