import collections
 
def findAnagrams(S):
   
    Map = collections.defaultdict(list) #armazena os anagramas
    
    N = len(S)                          #armazena o tamanho do S
     
    for i in range(N):                  #for que gera as substrings
        for j in range(i, N):
            curr = S[i: j + 1]          #armazenando a substrig gerada
            key = "".join(sorted(curr)) #ordenando a substring
             
            Map[key].append(curr)       #adicinando a substring em armazenamento
     
    result = []                         #armazenando o resultado final 
  
    cont = 0                            #armazenando numero de pares
    for vals in Map.values():           #for enquanto tiver string
        
        n = len(vals)
      
        if n > 1:                       #se o tamanho da lista for maior que 1
            cont+=(n*(n-1)/2)           #atualizando numero de pares
    print(int (cont))       
#se a sub string tiver mais que uma substring anagramatemos que contar qts pares sao e contamos isso com a formula n escolhe 2 onde n e o numero de substrings anagramas
            
S = input ()                            #coletando a palavra
findAnagrams(S)                         #rodando funçao