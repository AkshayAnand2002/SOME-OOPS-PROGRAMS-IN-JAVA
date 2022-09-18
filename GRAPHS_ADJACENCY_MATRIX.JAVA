public class graph {
int vertex;
int matrix[][];
public graph(int vertex) {
this.vertex=vertex;
matrix= new int[vertex][vertex];
}
public void addedge(int source,int destination) {
//adding edge
matrix[source][destination]=1;
//adding back edge
matrix[destination][source]=1;
}
public void printgraph() {
for(int i=0;i<vertex;i++) {
for(int j=0;j<vertex;j++) {
System.out.print(matrix[i][j]+" ");
}
System.out.println();
}
System.out.print("--------------------------------");
System.out.println();
for(int i=0;i<vertex;i++) {
System.out.print("VERTEX "+i+" IS CONNECTED TO: ");
for(int j=0;j<vertex;j++) {
if(matrix[i][j]==1) {
System.out.print(j+" ");
}
}
System.out.println();
}
}
public static void main(String[] args) {
graph g = new graph(5);
g.addedge(0,1);
g.addedge(0,4);
g.addedge(1,2);
g.addedge(1,3);
g.addedge(1,4);
g.addedge(2,3);
g.addedge(3,4);
g.printgraph();
}
}
