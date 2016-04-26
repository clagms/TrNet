library(ggplot2)
library(cowplot)

costsData = read.csv("./explicit_decompositions_costs.csv")

counter <- 0

costsData$i <- sapply(1:nrow(costsData), function(i){
  i
})

median(costsData$cost)
min(costsData$cost)
max(costsData$cost)

pdf("plots_full.pdf")

costsPlot <- ggplot(data=costsData , aes(x=i, y=cost)) +
  geom_point(na.rm = FALSE) +
  #scale_y_continuous(limits=c(NA, 4E05))
  scale_y_log10() + 
  theme(axis.text=element_text(size=20, face="bold"))

print(costsPlot)

dev.off()


interestingCostsData <- costsData
interestingCostsData <- costsData[costsData$cost < 1e07, ]
#interestingCostsData <- interestingCostsData[interestingCostsData$cost > 300000, ]
#interestingCost <- interestingCostsData[interestingCostsData$cost == max(interestingCostsData$cost), ]
#interestingCost[1, ]


pdf("plots_zoomed.pdf")

costsPlot <- ggplot(data=interestingCostsData , aes(x=i, y=cost)) +
  geom_point(na.rm = FALSE) +
  #scale_y_continuous(limits=c(NA, 4E05))
  scale_y_continuous() + 
  theme(axis.text=element_text(size=20, face="bold"))

print(costsPlot)

dev.off()

