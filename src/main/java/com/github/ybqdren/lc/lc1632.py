class Solution:
    def matrixRankTransform(self, mat: List[List[int]]) -> List[List[int]]:
        parent={}
        def find(a):
            if a not in parent:
                parent[a]=a
            if parent[a]!=a:
                parent[a]=find(parent[a])
            return parent[a]
        m,n=len(mat),len(mat[0])
        res=[[0]*n for _ in range(m)]
        for i in range(m):
            p={}
            for j in range(n):
                if mat[i][j] not in p:
                    p[mat[i][j]]=find((i,j))
                else:
                    parent[find((i,j))]=p[mat[i][j]]
        for j in range(n):
            p={}
            for i in range(m):
                if mat[i][j] not in p:
                    p[mat[i][j]]=find((i,j))
                else:
                    parent[find((i,j))]=p[mat[i][j]]
        arr=[]
        brr=defaultdict(list)
        for i in range(m):
            for j in range(n):
                arr.append((i,j,mat[i][j]))
                brr[find((i,j))].append((i,j))
        arr.sort(key=lambda x:x[2])
        max_x=defaultdict(int)
        max_y=defaultdict(int)
        for i,j,val in arr:
            if find((i,j)) in brr:
                ans=0
                for ni,nj in brr[find((i,j))]:
                    ans=max(ans,max_x[ni]+1,max_y[nj]+1)
                for ni,nj in brr[find((i,j))]:
                    res[ni][nj]=ans
                    max_x[ni]=ans
                    max_y[nj]=ans
                del brr[find((i,j))]
        return res